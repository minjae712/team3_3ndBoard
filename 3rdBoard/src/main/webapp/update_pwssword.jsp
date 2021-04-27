<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
div#line {
	position: absolute;
	top: 10%;
	left: 40%;
}
</style>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>암호 변경</title>
</head>
<body>
	<div id="line">
		<h1>암호 변경</h1>

		<hr>
		<form class="form-inline" action="changePassword.do" method="post">
			<div style="width: 35%" class="form-group">

				<label for="exampleInputName2">ID</label> <input
					class="form-control" type="text" value="${find.id}" name="id" readonly="readonly">
				<div>
					<label for="exampleInputName2">새 비밀번호</label> <input
						class="form-control" type="password" name="Password" required>
				</div>
				<br> <input class="form-control" type="submit" value="암호 변경" />
			</div>
		</form>
		<hr>
	</div>
</body>
</html>