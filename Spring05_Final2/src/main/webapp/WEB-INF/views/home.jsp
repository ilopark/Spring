<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/home.jsp</title>
<jsp:include page="include/resource.jsp"></jsp:include>
</head>
<body>
<jsp:include page="include/navbar.jsp"></jsp:include>
<div class="container">
	<h1>인덱스 페이지 입니다.</h1>
	<c:choose>
		<c:when test="${empty dto.id }">
			<ul>
				<li><a href="users/findid_form.do">아이디 찾기</a></li>
				<li><a href="users/findpwdform.do">비밀번호 찾기</a></li>
				<li><a href="cafe/list.do">글목록 보기</a></li>
				<li><a href="cafe/private/insertform.do">카페 글쓰러 가기</a></li>
				<li><a href="file/list.do">자료실 목록보기</a></li>
				<li><a href="gallery/list.do">갤러리 목록보기</a></li>
			</ul>
		</c:when>
	</c:choose>
	
</div>
</body>
</html>