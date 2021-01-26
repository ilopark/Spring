<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/delete.jsp</title>
</head>
<body>
<div class="container">
	<h1>Alert</h1>
	<p><strong>${num }</strong>회원 정보를 삭제 했습니다.</p>
	<a href="${pageContext.request.contextPath}/">인덱스로 가기</a>
	<a href="list.do">회원목록으로 가기</a>
</div>
</body>
</html>