<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>1부터 사용자가 입력한 값까지 숫자들을 span태그로 만들어 출력해보자 </h1>
<%	
	 int num = (int)request.getAttribute("num");
		for(int i = 1; i <= num; i++){ 
			if(i == 1){
		%>
		<span><%= i %></span>
	<% }else { %>
	<span>/<%= i %></span>
	
	<% } %>
	
<% } %>
<h1>사용자가 입력한 값이 짝수인지 홀수인지 판단해 h2 태그로 출력해보자.</h1>

<% if(num % 2 == 0){ %>
<h2>짝수입니다.</h2>
<% } else { %>
<h2>홀수입니다.</h2>
<% } %>
</body>
</html>