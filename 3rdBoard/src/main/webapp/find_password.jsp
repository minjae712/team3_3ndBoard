<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>암호 찾기</title>

</head>
<body>
	<h1>암호 찾기</h1>
	<hr>
	<form action="find_password.do" method="post">
		<table>
			<tr>
				<td >ID</td>
				<td><input type="text" id="id" name="id" required></td>
			</tr>
			<tr>
				<td >Email</td>
				<td><input type="text" id="email" name="email" required></td>
			</tr>
			<tr>
				<td><input type="submit" id=find_passwordBtn value="암호 찾기"></td>
			</tr>
			<!-- 정보가 일치하지 않을 때-->
			<c:if test="${check == 1}">
				<label>일치하는 정보가 존재하지 않습니다.</label>
			</c:if>

		</table>
	</form>
</body>
</html>