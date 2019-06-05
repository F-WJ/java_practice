<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  	<a href="${pageContext.request.contextPath}/product?cmd=input" target="_blank">添加</a>
	<table border="1"  cellpadding="0" cellspacing="0" width="80%">
  <tr>
    <th>编号</th>
    <th>商品名</th>
    <th>商品类型</th>
    <th>零售价</th>
    <th>供应商</th>
    <th>品牌</th>
    <th>折扣</th>
    <th>成本价</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${p}" var="p">
  <tr>
    <td>${p.id}</td>
    <td>${p.productName}</td>
    <td>${p.dir_id}</td>
    <td>${p.salePrice}</td>
    <td>${p.supplier}</td>
    <td>${p.brand}</td>
    <td>${p.cutoff}</td>
    <td>${p.costPrice}</td>
    <td><a href="${pageContext.request.contextPath}/product?cmd=input&id=${p.id}">编辑</a>   <a href="${pageContext.request.contextPath}/product?cmd=delete&id=${p.id}">删除</a></td>

  </tr>
  </c:forEach>
</table>

</body>
</html>