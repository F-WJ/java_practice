<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
     .lg2 {
        position: absolute;
        top: 26px;
        left: 150px;
    }
</style>
<div class="navbar cm-navbar">
    <img class="logo" alt="Brand" src="/static/images/logo.png">
    <img src="/static/images/logo1.png" class="lg2">
    <span class="pageTitle">&nbsp;</span>
    <ul class="nav navbar-nav navbar-right cm-navbar-nav ">
        <li>
           <p class="navbar-text text-info">${EMPLOYEE_IN_SESSION.name}</p>
        </li>
        <li><a href="/logout">安全退出</a></li>
        <li><a href="">个人设置</a></li>
    </ul>
</div>