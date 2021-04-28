<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<title>글 상세</title>
</head>
<body>

		<div align="left">
		댓글  ${count}개 
		<c:choose>
		<c:when test="${user != null}">
			<form action="insertComment.do" method="post">
			<input type="hidden" name="no" value="${board.no}"/>
			<input type="hidden" name="writer" value="${user.name}"/>
			<div>
			<label for="content">댓글</label>
			<textarea rows="3" cols="100" name="content" class="form-control"></textarea>
			</div>
			<div align="right">
				<button type="submit" class="btn btn-primary">등록</button>
				<botton type="reset" class="btn btn-default">취소</botton>
			</div>
			</form>
		</c:when>
		<c:when test="${user == null}">
			<h4>로그인이 필요합니다.</h4>
		</c:when>
		</c:choose>
		</div>
		<div align="left">
			<hr>
		<c:forEach items="${commentList}" var="comment">
				<div>
				<div><b>${comment.writer}</b></div>
				</div>
				<div>${comment.content}</div>
				<div><small>${comment.regDate}</small></div>
				<c:if test="${comment.writer == user.name}">
				<div align="right">
				<a href="deleteComment.do?no=${comment.no}&commentNo=${comment.commentNo}">[삭제]</a> 
				</div>
				</c:if>
				<hr>
		</c:forEach>
		</div>
</body>
</html>
