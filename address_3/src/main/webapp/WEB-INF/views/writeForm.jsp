<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록 작성</title>
</head>
<body>

<h3>주소록 작성</h3>

<table border="1">
		<form action="write" method="post">
			<tr>
				<td > 이름 </td>
				<td> <input type="text" name="aName" size = "20"> </td>
			</tr>
			<tr>
				<td > 전화번호 </td>
				<td> <input type="text" name="aPhone" size = "30"> </td>
			</tr>
			<tr>
				<td> 주소 </td>
				<td> <input type="text" name="aAddress" size = "70" > </td>
			</tr>
			<tr>
				<td> 전자우편 </td>
				<td> <input type="text" name="aEmail" size = "70" > </td>
			</tr>
			<tr>
				<td> 관계 </td>
				<td> <input type="text" name="aRelation" size = "70" > </td>
			</tr>

			<tr >
				<td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="list">목록보기</a></td>
			</tr>
		</form>
</table>
</body>
</html>