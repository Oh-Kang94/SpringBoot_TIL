<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색화면</title>
</head>
<body>
	<table width ="700" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>내용</td>
			<td>삭제</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td width ="30">${dto.bId}</td>
				<td width ="60">${dto.bName}</td>
				<td>${dto.bContent}</td>
				<td><a href="delete?bId=${dto.bId}">X</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="writeForm">글작성</a>
</body>
</html>