<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>信息${list.id == null ? '录入':'修改'}</h3>
	<form action="${pageContext.request.contextPath}/user?cmd=saveOrUpdate&id=${list.id}" method="post">
		<p>员工姓名：<input type="text" name="name" value="${list.name}" ></input></p>
		<p>工资总额：<input type="text" name="salary" value="${list.salary}" ></input></p>
		<p>入职时间：<input type="date" name="hiredate" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${list.hiredate}" />" ></input></p>
		<br/>
		
		<br/>
		<input  type="submit" value= ${ list.id == null ? '点击录入' : '确认修改'}></input>
	
	</form>
	
	
	
</body>
</html>