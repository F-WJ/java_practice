<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%@include file="/common/header.jsp"%>
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
                    <h1 class="page-head-line">商品编辑</h1>
                </div>
            </div>
            <div class="row col-sm-10">
         
                <form class="form-horizontal" action="/product.do?cmd=saveOrUpdate" method="post" id="editForm">
                    <input type="hidden"  name="id" value="${p.id}">
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">商品名称：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control"  name="productName" value="${p.productName}" placeholder="请输入商品的名称">
                        </div>
                    </div>
                    
                    
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">商品类型：</label>
                        <div class="col-sm-6">
                       	<select name="dir_id" class="form-control" >
                       		<option value="2" ${p.dir_id == 2 ? 'selected=' : '' } >无线鼠标</option>
                       		<option value="3" ${p.dir_id == 3 ? 'selected=' : '' } >有线鼠标</option>
                       		<option value="4" ${p.dir_id == 4 ? 'selected=' : '' } >游戏鼠标</option>
                       	</select>
                        </div>
                    </div>
                    
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">商品名称：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control"  name="productName" value="${p.productName}" placeholder="请输入商品的名称">
                        </div>
                    </div>
                    
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">零售价：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control"  name="salePrice" value="${p.salePrice}" placeholder="请输入商品的名称">
                        </div>
                    </div>
                    
                    
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">供应商：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control"  name="supplier" value="${p.supplier}" placeholder="请输入商品的名称">
                        </div>
                    </div>
                    
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">品牌名：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control"  name="brand" value="${p.brand}" placeholder="请输入商品的名称">
                        </div>
                    </div>
                    
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">折扣：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control"  name="cutoff" value="${p.cutoff}" placeholder="请输入商品的名称">
                        </div>
                    </div>
                    
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">成本价：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control"  name="costPrice" value="${p.costPrice}" placeholder="请输入商品的名称">
                        </div>
                    </div>

                    
                    <div class="form-group">
                        <div class="col-sm-offset-1 col-sm-6">
                            <button id="btn_submit" type="submit" class="btn btn-default">保存</button>
                            <button type="reset" class="btn btn-default">重置</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>