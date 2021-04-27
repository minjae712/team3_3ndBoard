<%@page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags/" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
 div {
 	margin-top : 10%;
 	text-align: center;
 }
 
</style>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
</head>
<body>
<div>
<h1><a onclick="location.reload()" style="cursor: pointer;"><b>게시판 프로그램</b></a></h1>
<hr>
<u:isLogin>						
	${user.name}님, 반갑습니다 !!<br><br>
	<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/logout.do">로그아웃하기</a> <br><br>
	<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/changePwdForm.jsp">암호 변경하기</a><br><br>
	<a class="btn btn-default" href="${pageContext.request.contextPath}/getBoardList.do">게시판 보기</a>
</u:isLogin>
<u:notLogin>
	어서오세요, 반갑습니다. <br><br>
		<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/login.jsp"><b>로그인하기</b></a><br><br>
		<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/createUser.jsp"><b>회원가입하기</b></a><br><br>
</u:notLogin>
</div>
</body>
</html>