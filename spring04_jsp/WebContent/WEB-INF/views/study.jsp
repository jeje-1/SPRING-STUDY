<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.PrintStream"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP 기초</h1>
<pre>
	 SSR(Server side Rendering) : 화면을 서버에서 구성하여 클라이언트에게 전달, ex) jsp, thymeleaf... 
	 CSR(Client side Rendering) : 서버에서는 데이터만 받아 클라이언트에서 화면을 구성하는 방식, ex) react, vue, angular...
	 
	 JSP는 기존의 서버용 언어인 Servlet에서
	 화면 구현에 관련된 소스를 별도로 분리해주는 기술
	 
	 jsp 주석
	 <%-- --%>
</pre>

<h2><%= request.getAttribute("tit1") %></h2>
<pre>
	지시자 태그란, 페이지 전체에서 사용할 속성을 지정하는 jsp의 태그
	표현식 : %lt;%@ %&gt;
	
	1. page 지시자태그 : 해당 페이지에서 사용할 속성을 지정
		1-1 : language : 사용할 프로그래밍 언어
		1-2 : import   : 해당 jsp에서 사용할 다른 패키지를 import할 때 사용
	
	2. include 지시자 태그 : 다른 위치의 jsp를 현재 jsp에 삽입할 때 사용
	3. taglib 지시자 태그 : 다른 라이브러리에서 제공하는 커스텀태그를 사용할 떄 사용
		 
</pre>

<h2>선언 태그</h2>
<pre>	
	 선언태그 : 선언태그는 필드에 메서드나, 변수를 선언할 때 사용.
	 		필드에 선언된 변수는, 멀티쓰래드 환경에서 공유자원이 되기 때문에 조심해서 사용해야 한다.
	 표현식 : %lt;%! %&gt;
	 
</pre>

<%! 
	String name = "mc";
	
	public void printName(){
	System.out.println(name); 
	}
%>

<h2>스크립트릿 태그</h2>
<pre>
	jsp 내부에서 자바의 소스코드를 작성하는 영역
	스크립트릿 내부에서 작성된 코드는 _jspService 메서드의 내부에 작성이 된다.
	
	_jspService 메서드에 선언되어있는 
	
	request, response, session, config(ServletConfig),, applicaiotn(servletContext)
	
	Servlet의 life cycle
	
	Page Scope : jsp의 pageContext객체, jsp안에서 생성되고 소멸되는 객체
	Request Scope : HttpServletRequest, HttpServletResponse, 요청이 오면 생성되고 응답이 끝남녀 소멸되는 객체
	Session Scope : HttpSession, 브라우저 Session을 스코프로 가지는 객체
	Application Scope : ServletContext 객체
	
</pre>

<% 
	printName();
	for(int i = 0; i < 5; i++){
	 System.out.println(i + "번째 스크립틀릿 태그");
	}
%>
<h2>표현식 태그</h2>
<pre>
	표현식 태그는 특정 객체나 변수를 출력하는 용도로 사용합니다. 
	out.print 메서드가 호출된다.
	표현식 : %lt;%= %&gt;
</pre>

<h3><%= name + ", 2023년 1월 19일 jsp공부함" %></h3>
</body>
</html>