<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>암호 변경</title>
</head>
<body>
	<center>
		<h1>암호 변경</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="changePassword.do" method="post">
			
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" value="${user.id}" name="id" readonly="readonly"> </td>
				</tr>
				<tr>
					<td bgcolor="orange">새 비밀번호</td>
					<td><input type="password" name="Password"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="암호 변경" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do">글 목록 가기</a>
	</center>
</body>
</html>