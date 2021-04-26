<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<h1>암호 변경</h1>
		
		
		<form action="changePassword.do" method="post">
			
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" value="${find_id}" name="id" readonly="readonly"> </td>
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

</body>
</html>