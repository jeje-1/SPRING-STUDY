package com.mc.mvc.common.code;

public enum Code {
	
	DOMAIN("http://localhost:8080"),
	SMTP_FROM("test239078@naver.com"),
	// 배포 시 servlet-context.xml 의 resources
	STORAGE_PATH("/Users/jeje/CODE/storage");
	
	public String desc;
	
	Code(String desc){
		this.desc = desc;
	}
	
	public String toString() {
		return desc;
	}

}
