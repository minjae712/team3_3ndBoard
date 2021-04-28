<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
div#line {
	margin-top : 5%;
}
</style>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>암호 찾기</title>
</head>
<body>

		<div id="line">
		<div align="center">
		<h1><a onclick="location.reload()" style="cursor: pointer;"><b>비밀번호 찾기</b></a></h1>
		</div>
			<hr>
			<div align="center">
				<form class="form-inline" action="findPassword.do" method="post">
				<div class="form-group">
					<label for="exampleInputName2">ID</label>
					<input class="form-control" type="text" placeholder="아이디" name="id" required>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail2">Email</label>
					<input type="email" class="form-control" placeholder="이메일" name="email" required>
					<input class="btn btn-default" type="submit" id="find_pwBtn" value="암호 찾기">
					<a class="btn btn-default" href="index.jsp">취소</a>
				</div>
		<!-- 정보가 일치하지 않을 때-->
 		<c:if test="${error.email}">
			<center><br><label>일치하는 정보가 존재하지 않습니다.</label></center>
		</c:if>
				</form>
				</div>
				<hr>
			</div>
</body>
</html>