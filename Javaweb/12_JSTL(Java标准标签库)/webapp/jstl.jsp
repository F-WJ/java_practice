<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
if语句：</br>
<c:if test="${2 == 2}">2 = 2</c:if>

</br>
循环
<c:forEach begin="1" end="10" step="1" var="num">
${num}
</c:forEach></br>
<c:forEach var="l" items="${list}">
${l}
</c:forEach>
</br>
日期：<fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss"/>
</body>
</html>