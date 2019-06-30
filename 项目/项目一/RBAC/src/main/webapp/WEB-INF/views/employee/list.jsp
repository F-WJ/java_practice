<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>叩丁狼</title>
    <%@include file="../common/header.jsp"%>
</head>
    <%--    我写的--%>
    <script>
        $(function () {
            $('#pagination-demo').twbsPagination({
                totalPages: ${pageResult.totalPage},
                visiblePages:${pageResult.pageSize},
                startPage:${pageResult.currentPage},
                first: '首页',
                prev: '上一页',
                next: '下一页',
                last: '尾页',
                onPageClick:function(event, page){
                    $('#page-content').text('Page '+page); //page为当前页
                    $('#currentPage').val(page);
                    $("form:first").submit();


                }
            });
        })
    </script>

<body>

    ${pageResult}
    ${depts}
<div class="container " style="margin-top: 20px">
    <%@include file="../common/top.jsp"%>
    <div class="row">
        <div class="col-sm-3">
            <%@include file="../common/menu.jsp"%>
        </div>
        <div class="col-sm-9">
            <div class="row">
                <div class="col-sm-12">
                    <h1 class="page-head-line">员工管理</h1>
                </div>
            </div>
            <!--高级查询--->
            <form class="form-inline" id="searchForm" action="/employee/list.do" method="post">
                <input type="hidden" name="currentPage" id="currentPage" value="1">
                <div class="form-group">
                    <label for="keyword">关键字:</label>
                    <input type="text" class="form-control" id="keyword" name="keyword" value="${qo.keyword}" placeholder="请输入姓名/邮箱">
                </div>
                <div class="form-group">
                    <label for="dept">部门:</label>
                    <select class="form-control" id="dept" name="deptId">
                        <option value="-1">全部</option>
                        <c:forEach var="d" items="${depts}">
                            <option value="${d.id}">${d.name}</option>
                        </c:forEach>
                    </select>
                    <script>
                        $("#dept option[value='${qo.deptId}']").prop("selected", true);
                    </script>
                </div>
                <input type="submit" id="btn_query" class="btn btn-default" value="查询">
                <a href="/employee/input.do" class="btn btn-success">添加</a>
            </form>

            <table class="table table-striped table-hover" >
                <thead>
                    <tr>
                        <th>编号</th>
                        <th>名称</th>
                        <th>email</th>
                        <th>年龄</th>
                        <th>部门</th>
                        <!--<th>角色</th>-->
                        <th>操作</th>
                    </tr>
                </thead>
               <c:forEach items="${pageResult.listData}" var="entity" varStatus="vs">
                   <tr>
                       <td>${vs.count}</td>
                       <td>${entity.name}</td>
                       <td>${entity.email}</td>
                       <td>${entity.age}</td>
                       <td>${entity.dept.name}</td>
                       <td>
                           <a class="btn btn-info btn-xs" href="/employee/input.do?id=${entity.id}">
                               <span class="glyphicon glyphicon-pencil"></span>编辑
                           </a>
                           <a href="/employee/delete.do?id=${entity.id}" class="btn btn-danger btn-xs" >
                               <span class="glyphicon glyphicon-trash"></span>删除
                           </a>
                       </td>
                   </tr>
               </c:forEach>
            </table>
            <div style="text-align: center;">
                <ul id="pagination-demo" class="pagination"></ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>