<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
	margin-top: 5%;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>새글등록</title>
</head>
<body>
	<center>
		<h1>글 등록</h1>
		<hr>
		<form class="form-inline" action="insertBoard.do" method="post">
			<div class="form-group">
				<label for="exampleInputName2">제목</label>
				<input type="text" name="title" class="form-control" placeholder="제목을 입력해주세요" style="width:500px" />
			</div>
			<br>
			<br>
			<div class="form-group">
				<label for="exampleInputName2">내용</label>
				<textarea name="content" class="form-control" placeholder="내용을 입력해주세요" style="width:500px;height: 300px"></textarea>
			</div>
			<br>
			<br>
					<input class="btn btn-default" type="submit" value=" 새글 등록 " />
					<input class="btn btn-default" type="button" onclick="history.back(-1);" value="취소">
		</form>
		<hr>
	</center>
</body>
</html>