package com.sedin.dc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dzy.support.platform.common.exception.CommonException;
import com.dzy.support.platform.common.util.FileUtil;
import com.dzy.support.platform.common.util.ObjectUtil;
import com.dzy.support.platform.web.common.BaseController;
import com.dzy.support.platform.web.util.PathUtil;
import com.sedin.dc.business.entity.DcFile;
import com.sedin.dc.business.service.IFileObjectService;

@Controller
@RequestMapping("/file")
public class FileController extends BaseController {

	/**
	 * 添加文件到
	 * @throws Exception
	 */
	@RequestMapping("/add")
	@ResponseBody
	public void addFile(@RequestParam("file") MultipartFile[] multipartFiles) throws CommonException, IOException {
		
		//创建service对象
		IFileObjectService service = (IFileObjectService) getService(IFileObjectService.class);
		
		if (ObjectUtil.isNullOrEmpty(multipartFiles)) {
			
			writeFailResult("file can not be null");
		}

		// 临时文件地址
		String fsPath = PathUtil.getResourcePath("/static/files/");
		
		List<File> files = new ArrayList<File>();
		
		for (MultipartFile multipartFile : multipartFiles) {
			
			String filePath = fsPath + "/" +multipartFile.getOriginalFilename();
			
			// 保存临时文件
			FileUtil.saveFile(multipartFile.getInputStream(), filePath);
			
			files.add(new File(filePath));
		}
		
		List<DcFile> fileObjs = service.addFiles(files);
		
		writeSuccessResult(fileObjs);
	}
	
	/**
	 * 获取文件
	 * @throws CommonException 
	 * @throws FileNotFoundException 
	 */
	@RequestMapping("/get")
	@ResponseBody
	public void getFile() throws CommonException, FileNotFoundException {
		
		String fileId = getParam("fileId");
		
		//创建service对象
		IFileObjectService service = (IFileObjectService) getService(IFileObjectService.class);
		
		DcFile fileObj = service.getFileById(fileId);
		
		writeSuccessResult(fileObj);
	}
	
	/**
	 * 获取文件
	 * @throws CommonException 
	 * @throws FileNotFoundException 
	 */
	@RequestMapping("/getmulti")
	@ResponseBody
	public void getFiles(@RequestBody List<String> fileIds) throws CommonException, FileNotFoundException {
		
		//创建service对象
		IFileObjectService service = (IFileObjectService) getService(IFileObjectService.class);
		
		List<DcFile> fileObj = service.getFileByIds(fileIds);
		
		writeSuccessResult(fileObj);
	}
}
