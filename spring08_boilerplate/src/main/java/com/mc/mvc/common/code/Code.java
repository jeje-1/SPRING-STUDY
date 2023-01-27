package com.mc.mvc.common.code;

public enum Code {
	
	DOMAIN("http://localhost:8080"),
	
	SMTP_FROM("test239078@naver.com");
	
	public String desc;
	
	Code(String desc){
		this.desc = desc;
	}
	
	public String toString() {
		return desc;
	}

}
