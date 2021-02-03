<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="tmp" items="${list }">
	<!-- 
		[ 칼럼의 폭을 반응형으로 ]
		device 폭 768px 미만에서  칼럼의 폭 => 6/12 (50%)
		device 폭 768px ~ 992px 에서  칼럼의 폭 => 4/12 (33.333%)
		device 폭 992  이상에서  칼럼의 폭 => 3/12 (25%)
	 -->
	<div class="col-6 col-md-4 col-lg-3">
		<div class="card mb-3">
			<a href="detail.do?num=${tmp.num}">
				<div class="img-wrapper">
					<img class="card-img-top" src="${pageContext.request.contextPath }${tmp.imagePath }" />
				</div>
			</a>
			<div class="card-body">
				<p class="card-text">${tmp.caption}</p>
				<p class="card-text">by <strong>${tmp.writer}</strong></p>
				<p><small>${tmp.regdate }</small></p>
			</div>
		</div>
	</div>
</c:forEach>
