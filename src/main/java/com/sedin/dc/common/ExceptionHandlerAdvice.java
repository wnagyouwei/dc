package com.sedin.dc.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzy.support.platform.common.util.LogHelper;
import com.dzy.support.platform.web.common.ResposeResult;

@ControllerAdvice
public class ExceptionHandlerAdvice{

	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String handlerException(Exception e) {
		
		LogHelper.getInstance().log(e.getMessage(),e);
		String value = e.getMessage();
		String result = ResposeResult.getFailResult(value);
		return result;
	}
	
}
