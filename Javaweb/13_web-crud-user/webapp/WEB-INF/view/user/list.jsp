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


<a href="${pageContext.request.contextPath}/user?cmd=edit">添加 </a>
<table align="center" width="80%" cellpadding="0" cellspacing="0" border="1">
  <tr align="center">
    <th>编号</th>
    <th>员工们</th>
    <th>工资</th>
    <th>入职时间</th>
    <th>操作</th>
  </tr>
  <!-- varStatus可以拿到遍历的序号 -->>
  <c:forEach items="${u}" var="u" varStatus="id">
  <tr align="center" style="background-color: ${id.count % 2 == 0 ? "LightGoldenRodYellow " : "AntiqueWhite"}">
    <td>${id.count}</td>
    <td>${u.name}</td>
    <td>${u.salary}</td>
	<!-- 时间格式 -->
  	<td><fmt:formatDate pattern="yyyy-MM-dd" value="${u.hiredate}"/></td>
 	<td><a href="${pageContext.request.contextPath}/user?cmd=edit&id=${u.id}">编辑</a>
 	<a href="${pageContext.request.contextPath}/user?cmd=delete&id=${u.id}">删除</a></td>>
  </tr>
   </c:forEach>
</table>

</body>
</html>