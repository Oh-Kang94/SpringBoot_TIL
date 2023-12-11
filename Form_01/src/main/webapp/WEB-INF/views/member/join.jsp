<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>join.jsp</h1>
	이름: 
	<input type="text" value=" ${member.name }" readonly="readonly"><br/>
	아이디: 
	<input type="text" value=" ${member.id }" readonly="readonly"><br/>
	비밀번호:
	<input type="password" value=" ${member.pw }">
	<br/>
	메일:
	<input type="text" value=" ${member.email }" readonly="readonly">
	<br/>
</body>
</html>