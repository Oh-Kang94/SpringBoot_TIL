<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록 내용 </title>
</head>
<body>

	<form action="modify" method="post">
 		<input type="hidden" name="seqno" value="${view.aId}">
		<table border="0">
			<tr>
				<td> 번호 </td>
				<td> ${view.aId} </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="name" value="${view.aName}"></td>
			</tr>
			<tr>
				<td> 전화번호 </td>
				<td> <input type="text" name="telno" value="${view.aPhone}"></td>
			</tr>
			<tr>
				<td> 주소 </td>
				<td> <input type="text" name="address" value="${view.aAddress}"></td>
			</tr>
			<tr>
				<td> 전자우편 </td>
				<td> <input type="text" name="email" value="${view.aEmail}"></td>
			</tr>
			<tr>
				<td> 관계 </td>
				<td> <input type="text" name="relation" value="${view.aRelation}"></td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" value="수정"> &nbsp;&nbsp; <a href="list">목록보기</a> &nbsp;&nbsp; <a href="delete?aId=${view.aId}">삭제</a></td> 
			</tr>
		</table>
	</form>
</body>
</html>