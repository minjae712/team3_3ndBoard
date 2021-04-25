<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
		<form action="updateBoard.do" method="post">
			<input type="hidden" name="no" value="${board.no}">
			<p>
				<b> 게시글 번호 : ${board.no} </b>
			</p>
			<div class="form-group" align="center">
				<p>
					<label for="exampleInputName2">제목 </label><br />
					<input type="text" name="title" value="${board.title}"
						class="form-control" style="width: 500px">
				</p>
			</div>
			<div class="form-group" align="center">
				<p>
					<label for="exampleInputName2">내용</label> <br />
					<textarea name="content" rows="5" cols="30" class="form-control"
						style="width: 500px; height: 300px">${board.content}</textarea>
				</p>
			</div>
			<input class="btn btn-default" type="submit" value="글 수정">
			<input class="btn btn-default" type="button" onclick="history.back(-1);" value="취소">
		</form>
	</center>
</body>
</html>
