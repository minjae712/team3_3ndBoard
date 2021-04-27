<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body{
	margin-top: 10%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>로그인</title>
</head>
<body>
	<center>
	<div style="width: 70%">
		<h1><a onclick="location.reload()" style="cursor: pointer;"><b>로그인</b></a></h1>
		<hr>
		<form class="form-inline" action="login.do" method="post">
			<div class="form-group" align="center">
					<label for="exampleInputName2">아이디</label>
					<input class="form-control" placeholder="ID" type="text" name="id" />
			</div>
			<div class="form-group" align="center">
					<label for="exampleInputName2">비밀번호</label>
					<input type="password" name="password" class="form-control" placeholder="비밀번호"/>
					<input type="submit" value="로그인" class="btn btn-default" />
					<a class="btn btn-default" href="index.jsp">취소</a>
			</div>
		</form>
		<hr>
					<a href="find_id.jsp"><b>아이디 찾기</b></a>&nbsp;|&nbsp;<a href="findPassword.jsp"><b>비밀번호 찾기</b></a>
	</div>
	</center>
</body>
</html>