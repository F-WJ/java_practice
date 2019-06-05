<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <a href="${pageContext.request.contextPath}/student?cmd=edit">添加</a>
 <table border="1" cellpadding="0" cellspacing="0" width="80%">
  <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>年龄</th>
    <th>班级</th>
    <th>操作</th>
  </tr>
  
  
  <c:forEach items="${s}" var="s">
  <tr>
    <td>${s.id}</td>
    <td>${s.name}</td>
    <td>${s.age}</td>
    <td>${s.clazz}</td>
    <td><a href="${pageContext.request.contextPath}/student?cmd=edit&id=${s.id}">编辑</a>  
    	<a href="${pageContext.request.contextPath}/student?cmd=delete&id=${s.id}">删除</a></td>
  </tr>
  </c:forEach>
</table>

</body>
</html>