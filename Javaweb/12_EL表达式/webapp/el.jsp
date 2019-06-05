<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
全部信息：${person}</br>
姓名：${person.name}</br>
姓名：${person["name"] }</br>
姓名：${person.getName()}</br>
爱好：${person.hobby[0]}</br>
map：${person.map.ip}</br>
map：${person.map["ip"]}</br>

<dir></dir>
加减乘除</br>
${num1} + ${num2} = ${num1 + num2}</br>
${num1} - ${num2} = ${num1 - num2}</br>
${num1} * ${num2} = ${num1 * num2}</br>
${num1} / ${num2} = ${num1 / num2}</br>

<div></div>

判断集合元素是否为空： ${empty list}</br>
</body>
</html>

判断：</br>
1 == 1 : ${1 == 1}</br>
1 == 1 : ${1 eq 1}</br>
