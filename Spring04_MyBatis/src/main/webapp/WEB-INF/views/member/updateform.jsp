<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/update.jsp</title>
</head>
<body>
<div class="container">
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${dto.num }"/>
		번호 <input type="text" value="${dto.num }" disabled/>
		이름 <input type="text" name="name" value="${dto.name }" />
		주소<input type="text" name="addr" value="${dto.addr }"/>	
		<button type="submit">입력</button>
	</form>
</div>
</body>
</html>