<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
<p>账号：<input type="text" name="username" ></p>
<p>密码：<input type="password" name="password" ></p>
验证码：<input type="text" name="randomCode" >
<img alt="" src="${pageContext.request.contextPath}/randomCode">
${errorMsg}
<p><input type="submit"  value="登录" ></p>

</form>
</body>
</html>