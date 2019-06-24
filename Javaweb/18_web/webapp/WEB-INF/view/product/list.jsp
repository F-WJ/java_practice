<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%@include file="/common/header.jsp"%>
   
   
   <script type="text/javascript">
   		function gotoPage(pageNum){
   			document.getElementById("currentPage").value=pageNum
   			document.forms[0].submit();
   			
   		}
   </script> 
</head>
<body>

<div class="container " style="margin-top: 20px">
    <%@include file="/common/top.jsp"%>
    <div class="row">
        <div class="col-sm-3">
            <%@include file="/common/menu.jsp"%>
        </div>
        <div class="col-sm-9">
            <div class="row">
                <div class="col-sm-12">
                    <h1 class="page-head-line">商品管理</h1>
                </div>
            </div>
            <!--高级查询--->
          	${re}
            <form action="/product.do" method="post">
                <a href="/product.do?cmd=input" class="btn btn-success">添加</a>
             	<p>
                </p>
             	商品名:<input type="text" name="productName" value="${qo.productName}" style="width: 100" >
             	价格：<input type="text" name="minSalePrice" value="${qo.minSalePrice}" style="width: 60"  >
             	 ~
             	 <input type="text" name="maxSalePrice" value="${qo.maxSalePrice}" style="width: 60" >
             	 <input type="submit" value="搜索" >
              

            <table class="table table-striped table-hover" >
                <thead>
                    <tr>
                        <th>编号</th>
                        <th>商品名</th>
                        <th>商品类型</th>
                        <th>零售价</th>
                        <th>供应商</th>
                        <th>品牌</th>
                        <th>折扣</th>
                        <th>成本价</th>
                        
                    </tr>
                </thead>
                
                <c:forEach items="${list}" var="p" varStatus="vs">
               <tr>
                       <td>${vs.count}</td>
                       <td>${p.productName}</td>
                       <td>${p.dir_id}</td>
                       <td>${p.salePrice}</td>
                       <td>${p.supplier}</td>
                       <td>${p.brand}</td>
                       <td>${p.cutoff}</td>
                       <td>${p.costPrice}</td>
                       <td>
                           <a class="btn btn-info btn-xs" href="/product.do?cmd=input&id=${p.id}">
                               <span class="glyphicon glyphicon-pencil"></span>编辑
                           </a>
                           <a href="product.do?cmd=delete&id=${p.id}" class="btn btn-danger btn-xs" >
                               <span class="glyphicon glyphicon-trash"></span>删除
                           </a>
                       </td>
                   </tr>
               </c:forEach>
                   <!-- 页码 -->
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
 	
 	<input type="submit" value="跳转">
  	
  	</td>
  	</tr>
 
                
            </table>
           </form>
        </div>
    </div>
</div>
</body>
</html>