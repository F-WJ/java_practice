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
b

<fmt:formatDate value="${date}" pattern="yyyy-MM-dd"/>
	
	<h3>人头上传</h3>
	<form action="/upload" method="post" enctype="multipart/form-data">
	 	<p>姓名:<input type="text" name="username"/></p>
    	<p>年龄:<input type="text" name="age"/></p>
	
		<p>文件:<input type="file" name="pic"/></p>
		<p><input type="submit" value="提交"></p>
	</form>
</body>
</html>