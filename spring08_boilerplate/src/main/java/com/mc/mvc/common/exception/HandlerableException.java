package com.mc.mvc.common.exception;

import com.mc.mvc.common.code.ErrorCode;

public class HandlerableException extends RuntimeException {

	private static final long serialVersionUID = 3075693636132904131L;
	
	public ErrorCode error;
	
	public HandlerableException(ErrorCode error) {
		this.error = error;
	}
	
	public HandlerableException(ErrorCode error, Exception e) {
		this.error = error;
		e.printStackTrace();
	}
}
