package com.mc.mvc.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.mc.mvc.common.code.ErrorCode;
import com.mc.mvc.common.exception.HandlerableException;

public class MemberAuthInterceptor implements HandlerInterceptor {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) 
	throws Exception {
		HttpSession session = request.getSession();
		
		String[] uriArr = request.getRequestURI().split("/");
		
		switch (uriArr[2]) {
	
		case "mypage":
			if(session.getAttribute("auth") == null) throw new HandlerableException(ErrorCode.UNAUTHORIZED_REQUEST);
			break;


		default:
			break;
		}
		
		return true;
	}
}
