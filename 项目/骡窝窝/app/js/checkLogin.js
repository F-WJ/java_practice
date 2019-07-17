//如果sessionStorage中有用户信息,就是已经登陆,如果没有就需要跳登陆页面
var userStr = sessionStorage.getItem("user");
var user;
if(userStr){
    user = JSON.parse(userStr);
}else{
    window.location.href = "/login.html";
}
//前端路由控制页面跳转