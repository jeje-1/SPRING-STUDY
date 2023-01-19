<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>성적입력</h1>
<form action="/spring04_jsp/el" method="post">
   <label>이름 : <input type="text" name="name"></label><br>
   <label>국어 : <input type="num" name="kor"></label><br>
   <label>영어 : <input type="num" name="eng"></label><br>
   <label>수학 : <input type="num" name="math"></label><br>
   <label>코딩 : <input type="num" name="coding"></label><br>
   <button>전송</button>
</form>

</body>
</html>