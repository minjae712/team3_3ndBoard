<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
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
					<td colspan="5"><c:out value="${nvo.title}" /></td>
				</tr>
				<tr>
					<td>게시글번호</td>
					<td colspan="6"><c:out value="${nvo.no}" /></td>
				</tr>
				<tr>
					<td colspan="1">작성자</td>
					<td colspan="1"><c:out value="${nvo.writer}" /></td>
					<td colspan="1">등록일</td>
					<td colspan="1"><c:out value="${nvo.regDate}" /></td>
					<td colspan="1">조회수</td>
					<td colspan="1"><c:out value="${nvo.cnt}" /></td>
				</tr>
				<tr>
					<td colspan="6" height="400"><c:out value="${nvo.content}" />
					</td>
				</tr>
				<tr>
				</tr>
			</table>
			<hr>
	</div>
		<hr>
		<c:if test="${user.isAdmin()}">
		<a class="btn btn-default" href="insertNotice.jsp">공지등록</a>&nbsp;&nbsp;&nbsp; 
		<a class="btn btn-default" href="deleteNotice.do?uni=${nvo.uni}">공지 삭제</a>&nbsp;&nbsp;&nbsp;
		</c:if>
		<a class="btn btn-default" href="getBoardList.do">글목록</a>
	</center>
</body>
</html>
