package com.sedin.dc.business.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import com.dzy.support.platform.common.exception.CommonException;
import com.dzy.support.platform.datahouse.exception.DataHouseException;
import com.dzy.support.platform.persistence.exception.PersistenceException;
import com.dzy.support.platform.service.common.IBaseService;
import com.sedin.dc.business.entity.DcFile;

/**
 * 文件接口
 * @author zqy
 * @version 1.0
 * @date 2018-11-27
 */
public interface IFileObjectService extends IBaseService<DcFile>{

    /**
     * 取得文件信息，存入hadoop存储
     * 生成文件信息插入file_object表
     *
     * @param files 文件对象
     * @return 
     */
	List<DcFile> addFiles(List<File> files) throws PersistenceException, CommonException;

	/**
	 * 根据文件ID获取文件
	 * @param fileId 文件ID
	 * @throws PersistenceException 
	 * @throws DataHouseException 
	 * @throws CommonException 
	 * @throws FileNotFoundException 
	 */
	DcFile getFileById(String fileId) throws CommonException, FileNotFoundException;

	/**
	 * 
	 * @param fileIds 文件ID集合
	 * @return
	 * @throws CommonException
	 * @throws FileNotFoundException
	 */
	List<DcFile> getFileByIds(List<String> fileIds) throws CommonException, FileNotFoundException;
}
