<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags/" %>

<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<head>
<meta charset="utf-8">
<title>회원제 게시판 예제</title>						
</head>  
<body>
<div align="right">	
<u:isLogin>						
	${user.name}님, 환영합니다.
	<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/logout.do">로그아웃하기</a>
	<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/changePwdForm.jsp">암호 변경하기</a>
	<a class="btn btn-default" href="${pageContext.request.contextPath}/index.jsp">메인으로</a>
</u:isLogin>
<u:notLogin>
			
		<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/login.jsp"><b>로그인하기</b></a>
		<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/createUser.jsp"><b>회원가입하기</b></a>
		<a class="btn btn-default" href="${pageContext.request.contextPath}/index.jsp">메인으로</a>
</u:notLogin>
</div>	
</body>
</html>