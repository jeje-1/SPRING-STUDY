package com.mc.servlet.filter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class ViewWrapper extends HttpServletRequestWrapper {
	
	// HttpServletRequestWrapper Decorator 패턴이 적용되어 있다.
	// HttpServletRequest객체에 기능을 추가하고 싶을 떄 사용할 수 있다.
	
	HttpServletRequest request;

	public ViewWrapper(HttpServletRequest request) {
		super(request);
		this.request = request;
		// TODO Auto-generated constructor stub
	}
	
	//1. 새로운 메서드 추가
	public void testAddMethod() {
		System.out.println("ViewWrapper에 새롭게 추가된 메서드 호출!");
	}
	
	// 2. 메서드 오버라이드
	@Override
	public RequestDispatcher getRequestDispatcher(String path) {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB_INF/views" + path + ".html");
		return rd;
	}

}
