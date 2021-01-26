<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>Alert</h1>
	<p><strogn>${dto.num }</strogn>회원 정보를 수정 했습니다.</p>
	<a href="${pageContext.request.contextPath}/">인덱스로 가기</a>
	<a href="list.do">목록보기</a>
</div>
</body>
</html>