<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
    <h3>Registration</h3>
    
    <form action="" method="post">
            <table border="1">
                <tr>
                    <td > User ID : </td>
                    <!-- <td> <input type="text" name="name" value=<%= session.getAttribute("userid") %> size = "20" readonly="readonly"> </td> -->
                    <td> <input type="text" name="name" value="${userid}" size = "20" readonly="readonly"> </td>
                </tr>
                <tr>
                    <td > Password : </td>
                    <!-- <td> <input type="text" name="password" value=<%=session.getAttribute("password") %> size = "20" readonly="readonly"> </td> -->
                    <td> <input type="text" name="password" value="${password}" size = "20" readonly="readonly"> </td>
                </tr>
    
            </table>
    </form>
</body>
</html>