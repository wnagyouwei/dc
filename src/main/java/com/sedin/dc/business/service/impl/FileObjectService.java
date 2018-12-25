package com.sedin.dc.business.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.dzy.support.platform.common.exception.CommonException;
import com.dzy.support.platform.common.util.FileUtil;
import com.dzy.support.platform.common.util.GenerateSequenceUtil;
import com.dzy.support.platform.common.util.ObjectUtil;
import com.dzy.support.platform.common.util.Principal;
import com.dzy.support.platform.datahouse.common.IDataHouse;
import com.dzy.support.platform.datahouse.constants.DataHouseConstants;
import com.dzy.support.platform.datahouse.util.DataHouseFactory;
import com.dzy.support.platform.persistence.exception.PersistenceException;
import com.dzy.support.platform.persistence.provider.Compare;
import com.dzy.support.platform.service.common.BaseService;
import com.dzy.support.platform.service.exception.ServiceException;
import com.dzy.support.platform.web.util.PathUtil;
import com.sedin.dc.business.entity.DcFile;
import com.sedin.dc.business.model.DcFileModel;
import com.sedin.dc.business.service.IFileObjectService;

/**
 * 文件接口实现类
 * @author zqy
 * @date 2018-11-27
 */
public class FileObjectService extends BaseService<File> implements IFileObjectService
{

	public FileObjectService(Principal principal) throws CommonException
	{
		super(principal,File.class);
	}

	/**
	 * 文件上传
	 * @param file 文件对象
	 * @throws PersistenceException 
	 * @throws CommonException
	 */
	@Override
	public List<DcFile> addFiles(List<File> files) throws PersistenceException, CommonException{
		
		//开启事务
		enableTransaction();
		
		List<DcFile> result = new ArrayList<DcFile>();
		
		for (File file : files) {
			
			// 查询checkSum是否存在
			DcFileModel dcModel = new DcFileModel(principal);
			
			List<DcFile> hasFiles = dcModel.selectByCondition("CHECKSUM",Compare.EQ,FileUtil.getFileMD5(file));

			if (!ObjectUtil.isNullOrEmpty(hasFiles)) {
				
				throw new ServiceException(file.getName() +  "文档已存在");
				
			}
			
			// 声明数据仓库工厂类
			DataHouseFactory factory = DataHouseFactory.getInstance();

			// 获取数据仓库实例
			IDataHouse dh = factory.getDataHouse();

			//创建文件类对像
			DcFile fb = new DcFile();

			fb.setId(GenerateSequenceUtil.generateSequenceNo());

			fb.setFileName(file.getName());

			// 设置文件大小
			fb.setFileSize(String.valueOf(file.length()));

			String checkSum = FileUtil.getFileMD5(file);

			// 设置唯一码
			fb.setChecksum(checkSum);

			// 取得文件类型
			String prefix = FileUtil.getFileExtension(file.getName());

			// 设置文件类型
			fb.setFileType(prefix);

			// 设置删除标志
			fb.setDelFlag(false);

			// 设置Hadoop路径
			fb.setHdPath(DataHouseConstants.ROOT_URL + checkSum + DataHouseConstants.FILE_EXTENSION);

			// 文件系统实际路径
			String fsPath = dh.getWebFileDirectory() + file.getName();
			
			// 设置文件系统实际路径
			fb.setFsPath(fsPath);

			dcModel.insert(fb);

			// 保存文件
			dh.createFile(DataHouseConstants.ROOT_URL + checkSum + DataHouseConstants.FILE_EXTENSION, file);
			
			result.add(fb);
		}
		
		return result;
	}
	
	@Override
	public DcFile getFileById(String fileId) throws CommonException, FileNotFoundException {
		
		DcFileModel foModel = new DcFileModel(principal);
		
		DcFile fileObj = foModel.selectByPrimaryKey(fileId);
		
		// 如果fsPath存在 直接返回
		if (FileUtil.isNetFileAvailable(fileObj.getFsPath())) {
			
			return fileObj;
		}
		
		updateFile(foModel, fileObj);
		
		return fileObj;
	}
	
	@Override
	public List<DcFile> getFileByIds(List<String> fileIds) throws CommonException, FileNotFoundException {
		
		DcFileModel foModel = new DcFileModel(principal);
		
		List<DcFile> fileObjs = foModel.selectByCondition("ID", Compare.IN,fileIds.toArray());
		
		List<DcFile> result = new ArrayList<DcFile>();
		
		for (DcFile fileObject : fileObjs) {
			
			// 如果fsPath不存在下载
			if (!FileUtil.isNetFileAvailable(fileObject.getFsPath())) {
				
				updateFile(foModel, fileObject);
			}
			
			result.add(fileObject);
		}
		
		return result;
	}
	
	/**
	 * 下载文件到FSPATH
	 * @param foModel
	 * @param fileObj
	 * @throws CommonException
	 * @throws FileNotFoundException
	 */
	private void updateFile(DcFileModel foModel,DcFile fileObj) throws CommonException, FileNotFoundException {
		
		// 声明数据仓库工厂类
		DataHouseFactory factory = DataHouseFactory.getInstance();

		// 获取数据仓库实例
		IDataHouse dh = factory.getDataHouse();
		
		String rootPath = PathUtil.getResourcePath("/static/files/");
		
		String localPath = rootPath + "/" + fileObj.getFileName();
		
		dh.download(fileObj.getHdPath(), localPath);
		
		String fsPath = dh.getWebFileDirectory() + fileObj.getFileName();
		
		fileObj.setFsPath(fsPath);
		
		foModel.updateByPrimaryKey(fileObj);
	}
}
