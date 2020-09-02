<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	alert("<c:out value='${ msg }'></c:out>");

	<%-- 패스워드 변경후 팝업창을 닫기 위한 스크립트 코드 --%>

	<%= request.getAttribute("script") != null ? request.getAttribute("script") : ""%>
	
	location.href = '<c:out value="${ loc }"/>';
</script>
</head>
<body>

</body>
</html>