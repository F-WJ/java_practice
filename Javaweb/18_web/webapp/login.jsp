<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>叩丁狼客户管理系统->用户登录</title>
<link rel="stylesheet" href="/css/core.css" type="text/css" />
	<link rel="stylesheet" href="/js/plugins/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="/css/core.css" type="text/css" />
	<script src="/js/plugins/jquery/jquery-2.1.4.min.js"></script>
	<script src="/js/plugins/bootstrap/js/bootstrap.js"></script>
<style type="text/css">
body{
	background-color:  #FFFFFF;
}
.cm-container{
	margin-top: 160px;
}
.login {
	width: 360px;
	height: 300px;
	margin: 0px auto;
}
</style>


<script type="text/javascript">
	function changeRandomCode(){
		document.getElementById("randomCode").src="/randomCode?" + new Date().getTime();
		
	}
	

</script>

</head>
<body>
	<div class="container cm-container">
		<h3 class="text-center"><font style="color: #337ab7;">叩丁狼客户管理系统(系统管理平台)</font></h3>
		<hr />
		<div class="login">
			<form id="loginForm" action="/login" method="post">
				<div class="form-group form-group-lg">
					<div class="input-group">
						<div class="input-group-addon">用户名</div>
						<!-- 获取cookie中的的值 -->
						<input class="form-control" name="username"  value="${cookie.REMEMBER_IN_COOKIE.value}"/>
					</div>
				</div>
				<div class="form-group form-group-lg">
					<div class="input-group">
						<div class="input-group-addon">密&emsp;码</div>
						<input class="form-control" name="password" type="password" value=""/>
					</div>
				</div>
				
				<div class="form-group form-group-lg">
					<div class="input-group">
						<div class="input-group-addon">验证码</div>
						<input class="form-control" name="randomCode" type="text" value="" style="width: 200" />
						<!-- 通过style添加鼠标放置到图片上显示小手的功能 -->
						&nbsp<img alt="" src="/randomCode" id="randomCode" onclick="changeRandomCode()" style="cursor: pointer;" />
					</div>
				</div>
				
				
						<!-- 默认是on -->
						<div >记住账号  <input  type="checkbox" value="true" name="rememberMe" ${cookie.REMEMBER_IN_COOKIE == null ? '' : 'checked' } />
					</div>
			
				
				<div class="form-group">
					
					<input type="submit" value="登录" class="btn btn-lg btn-primary btn-block" >
				</div>
				<div>
					${errorMsg}
					</div>
			</form>
		</div>
	</div>
</body>
</html>