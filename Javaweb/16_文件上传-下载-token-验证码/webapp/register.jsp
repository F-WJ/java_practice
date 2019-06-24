<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>注册页面</h2>
	<form action="${pageContext.request.contextPath}/register" method="post" enctype="multipart/form-data">
		<p>账号：<input type="text" name="username"></p>
		<p>头像：<input type="file" name="headImg"></p>
		<p><input  type="submit" value="注册"></p>
	
	</form>
</body>
</html>