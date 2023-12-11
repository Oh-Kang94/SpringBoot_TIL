<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 검색</title>
</head>
<body>
	<h3>영화 검색</h3>
	<br />
	<br />
	<table
		style="table-layout: auto; border-collapse: collapse; border: 1px solid black;">
		<tr>
			<td>영화 이미지</td>
			<td>영화 제목</td>
		</tr>
		<c:set var="cnt" value="0" />
		<c:forEach items="${list}" var="dto">
			<tr>
				<td><img alt="사진이 없습니다." src="${dto.image}"></td>
				<td style="width: fit-content;">${dto.title}</td>
			</tr>
			<c:set var="cnt" value="${cnt+1}" />
		</c:forEach>
	</table>



	<p>
		검색 결과는 <b>${cnt }</b>건 입니다.
	</p>
</body>
</html>