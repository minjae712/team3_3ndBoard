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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세</title>
</head>
<body>
	<center>
		<hr>
		<form class="form-inline" action="updateBoard.do" method="post">
			<input type="hidden" name="no" value="${board.no}">
				<b> 게시글 번호 : ${board.no} </b>
				<br>
			<div class="form-group">
					<label for="exampleInputName2">제목 </label>
					<input type="text" name="title" value="${board.title}" class="form-control" style="width: 500px">
			</div>
			<br>
			<br>
			<div class="form-group">
					<label for="exampleInputName2">내용</label>
					<textarea name="content" rows="5" cols="30" class="form-control"
						style="width: 500px; height: 300px">${board.content}</textarea>
			</div>
			<br>
			<br>
			<input class="btn btn-default" type="submit" value="글 수정">
			<input class="btn btn-default" type="button" onclick="history.back(-1);" value="취소">
		</form>
	</center>
	<hr>
</body>
</html>
