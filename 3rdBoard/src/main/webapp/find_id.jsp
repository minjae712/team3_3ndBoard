<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
 div#line {
 	margin-top : 5%;
 }
 
</style>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>아이디 찾기</title>
</head>
<body>
	<div id="line" align="center">
	
		<h1><a onclick="location.reload()" style="cursor: pointer;"><b>아이디 찾기</b></a></h1>
		<hr>
	
			<form class="form-inline" action="find_id.do" method="post">
				<label for="exampleInputName2">Email</label>
				<input class="form-control" type="text" id="email" placeholder="Email" name="email" required>
				<input class="btn btn-default" type="submit" id="find_idBtn" value="ID찾기">
					<c:if test="${check == 1}">
						<label>일치하는 정보가 존재하지 않습니다.</label>
					</c:if>
					<!-- 이름과 비밀번호가 일치하지 할 때 -->
					<c:if test="${check == 0 }">
						<br><label>찾으시는 아이디는' ${find_id}' 입니다.</label>
					</c:if>
			</form>
			
			<hr>
			<a href="index.jsp">메인 화면으로</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			<a href="findPassword.jsp">비밀번호 찾기</a>
			<hr>
		
			</div>
</body>
</html>