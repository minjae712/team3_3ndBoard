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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>암호 변경</title>
</head>
<body>
	<center>
	<div style="width: 70%">
		<h1><a onclick="location.reload()" style="cursor: pointer;"><b>비밀번호 변경</b></a></h1>
		<hr>
		<form class="form-inline" action="changePassword.do" method="post">
			<div class="form-group" align="center">
				<label for="exampleInputName2">아이디</label>
				<input class="form-control" placeholder="ID" type="text" value="${user.id}" name="id" readonly="readonly">
			</div>	
			<div class="form-group" align="center">	
				<label for="exampleInputName2">새 비밀번호</label>
				<input type="password" name="Password" class="form-control" placeholder="새 비밀번호" />
				<input type="submit" value="비밀번호 변경" class="btn btn-default" />
				<input class="btn btn-default" type="button" onclick="history.back(-1);" value="취소">
			</div>
		</form>
		<hr>
	</div>
	</center>
</body>
</html>