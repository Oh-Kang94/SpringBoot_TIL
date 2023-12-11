<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBatis 주소록 리스트</title>
</head>
<body>
	<h6>MyBatis 주소록 리스트</h6>
	<br />
	<br />
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>내용</td>
			<td>주소</td>
			<td>전자우편</td>
			<td>관계</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td><a href="view?aId=${dto.aId}">${dto.aId}</a></td>
				<td>${dto.aName}</td>
				<td>${dto.aPhone}</td>
				<td>${dto.aEmail}</td>
				<td>${dto.aRelation}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="writeForm">주소록 등록</a>

</body>
</html>