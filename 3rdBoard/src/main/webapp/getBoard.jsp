<%@page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags/" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세</title>
</head>
<body>
	<center>
		<%@ include file="/menuBar.jsp" %>
		<h1><a onclick="location.reload()" style="cursor: pointer;"><b>자유 게시판</b></a></h1>
		<hr>
		<div style="width: 70%">
			<table class="table table-bordered" >
				<tr>
					<td colspan="1">제목</td>
					<td colspan="5">${board.title}</td>
				</tr>
				<tr>
					<td>게시글번호</td>
					<td colspan="6">${board.no}</td>
				</tr>
				<tr>
					<td colspan="1">작성자</td>
					<td colspan="1">${board.writer}</td>
					<td colspan="1">등록일</td>
					<td colspan="1">${board.regDate}</td>
					<td colspan="1">조회수</td>
					<td colspan="1">${board.cnt}</td>
				</tr>
				<tr>
					<td colspan="6" height="400">${board.content}
					</td>
				</tr>
				<tr>
				</tr>
			</table>
					<center>
					<a class="glyphicon glyphicon-thumbs-up" href="goodOrBad.do?good=1&no=${board.no}">추천 ${mvo.good}</a>&nbsp;&nbsp;
					<a class="glyphicon glyphicon-thumbs-down" href="goodOrBad.do?bad=1&no=${board.no}">반대 ${mvo.bad}</a>
					</center>
			<hr>
			<%@ include file="/comment.jsp" %>
	</div>
		<hr>
		<u:isLogin>
		<a class="btn btn-default" href="updateBoard.jsp">글수정</a>&nbsp;&nbsp;&nbsp; 
		<a class="btn btn-default" href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a class="btn btn-default" href="deleteBoard.do?no=${board.no}">글삭제</a>&nbsp;&nbsp;&nbsp;
		</u:isLogin>
		<a class="btn btn-default" href="getBoardList.do">글목록</a>
	</center>
</body>
</html>
