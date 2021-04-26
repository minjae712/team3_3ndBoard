<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>아이디 찾기</title>
</head>
<body>
	<h1>아이디 찾기</h1>
	<hr>
	<form action="find_id.do" method="post">
		<table>
			<tr>
				<td>Email</td>
				<td><input type="text" id="email" name="email" required></td>
				<td><input type="submit" id=find_idBtn
					value="ID찾기"></td>



				<c:if test="${check == 1}">
					<label>일치하는 정보가 존재하지 않습니다.</label>
				</c:if>

				<!-- 이름과 비밀번호가 일치하지 할 때 -->
				<c:if test="${check == 0 }">
					<label>찾으시는 아이디는' ${find_id}' 입니다.</label>
				</c:if>
			</tr>
		</table>
	</form>
	<hr>
	<a href="index.jsp">메인 화면으로</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="find_password.jsp">비밀번호 찾기</a>
	<hr>
</body>
</html>