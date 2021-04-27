<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
div#line {
	position: absolute;
	top: 10%;
	left: 20%;
}
</style>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>암호 찾기</title>
</head>
<body>

		<div id="line">
	<form class="form-inline" action="find_password.do" method="post">
		<h1>암호 찾기</h1>
			<hr>
			<div>
				<div class="form-group">
					<label for="exampleInputName2">ID</label> <input
						class="form-control" type="text" id="id" placeholder="아이디"
						name="id" required>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail2">Email</label> <input type="email"
						class="form-control" id="email" placeholder="이메일" name="email"
						required>
					<input class="btn btn-default" type="submit" id="find_pwBtn" value="암호 찾기">
		<!-- 정보가 일치하지 않을 때-->
		<c:if test="${check == 1}">
			<label>일치하는 정보가 존재하지 않습니다.</label>
		</c:if>
					<a class="btn btn-default" href="index.jsp">취소</a>
				</div>
				<hr>
			</div>
	</form>
		</div>

</body>
</html>