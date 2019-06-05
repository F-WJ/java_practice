<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	//
	function gotoPage(pageNum){
		document.getElementById("currentPage").value=pageNum
		document.forms[0].submit();
	}
</script>
</head>
<body>
${pr}
<p></p>
${qo}
<form  action="/product" method="post">
	货品名:<input  type="text" name="productName" value="${qo.productName}">
	价格：<input type="text" name="minSalePrice" value="${qo.minSalePrice}">~
	<input type="text" name="maxSalePrice" value="${qo.maxSalePrice}">
	<input type="submit" value="查询">
	<p></p>
  	<!-- <a href="${pageContext.request.contextPath}/product?cmd=input" target="_blank">添加</a> -->
	<table align="center" border="1"  cellpadding="0" cellspacing="0" width="80%">
  <tr>
    <th>编号</th>
    <th>商品名</th>
    <th>商品类型</th>
    <th>零售价</th>
    <th>供应商</th>
    <th>品牌</th>
    <th>折扣</th>
    <th>成本价</th>
    <!--  <th>操作</th>-->
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
    <!-- <td><a href="${pageContext.request.contextPath}/product?cmd=input&id=${p.id}">编辑</a>   <a href="${pageContext.request.contextPath}/product?cmd=delete&id=${p.id}">删除</a></td>
	-->
 </tr>
  </c:forEach>
  	<tr align="center">
  	<td colspan="8">
  	<a href="javaScript:gotoPage(1)">首页</a>
  	<a href="javaScript:gotoPage(${pr.prevPage})">上一页</a>
  	<a href="javaScript:gotoPage(${pr.nextPage})">下一页</a>
  	<a href="javaScript:gotoPage(${pr.totalPage})">尾页</a>
  	共${pr.totalCount}条数据页次   ${pr.currentPage}/${pr.totalPage} 页  
  	条数<select name="pageSize">
  		<option value="3" ${pr.pageSize == 3 ? "selected" : "" }>3</option>
  		<option value="5" ${pr.pageSize == 5 ? "selected" : "" }>5</option>
  		<option value="8" ${pr.pageSize == 8 ? "selected" : "" }>8</option>
  	</select>
 	<input  id="currentPage"  type="number"  name="currentPage" style="width: 30px;" value="${result.currentPage}" >
 	
 	<input type="submit" value="GO">
  	
  	</td>
  	</tr>
  	

</table>
</form>
</body>
</html>