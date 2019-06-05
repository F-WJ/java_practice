<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
${re }
${qo }

<form  action="${pageContext.request.contextPath}/user" method="post">
	姓名:<input  type="text" name="userName" value="${qo.userName}">
	年龄：<input type="text" name="minSalary" value="${qo.minSalary}">~
	<input type="text" name="maxSalary" value="${qo.maxSalary}">
	<input type="submit" value="查询">
	<p></p>
	
 <a href="${pageContext.request.contextPath}/user?cmd=edit">添加</a>
 <table border="1" cellpadding="0" cellspacing="0" width="80%">
  <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>工资</th>
    <th>入职时间</th>
    <th>操作</th>
  </tr>
  
  
  <c:forEach items="${re.listData}" var="list">
  <tr>
    <td>${list.id}</td>
    <td>${list.name}</td>
    <td>${list.salary}</td>
    <td>${list.hiredate}</td>
    <td><a href="${pageContext.request.contextPath}/user?cmd=edit&id=${list.id}">编辑</a>  
    	<a href="${pageContext.request.contextPath}/user?cmd=delete&id=${list.id}">删除</a></td>
  </tr>
  </c:forEach>
    	<tr align="center">
  	<td colspan="8">
  	<a href="javaScript:gotoPage(1)">首页</a>
  	<a href="javaScript:gotoPage(${re.prevPage})">上一页</a>
  	<a href="javaScript:gotoPage(${re.nextPage})">下一页</a>
  	<a href="javaScript:gotoPage(${re.totalPage})">尾页</a>
  	共${re.totalCount}条数据页次   ${re.currentPage}/${re.totalPage} 页  
  	条数<select name="pageSize">
  		<option value="3" ${re.pageSize == 3 ? "selected" : "" }>3</option>
  		<option value="5" ${re.pageSize == 5 ? "selected" : "" }>5</option>
  		<option value="8" ${re.pageSize == 8 ? "selected" : "" }>8</option>
  	</select>
 	<input  id="currentPage"  type="number"  name="currentPage" style="width: 30px;" value="${re.currentPage}" >
 	
 	<input type="submit" value="GO">
  	
  	</td>
  	</tr>
</table>
</form>
</body>
</html>