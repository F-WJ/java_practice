
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>失败客户管理</title>
        <#include "../common/link.ftl"/>
        <script type="text/javascript">

            //编辑
            $(function () {
                $(".inputBtn").click(function () {

                    //弹出模态框
                    $("#editModal").modal("show");
                    //修改模态框标题
                    $(".inputTitle").html("客户添加");
                    //数据复原
                    $("#editForm")[0].reset();

                    //客户回显数据
                    var data = $(this).data("json");
                    if(data){
                        $(".inputTitle").html("客户编辑");
                        $("#editForm input[name='id']").val(data.id);
                        $("#editForm input[name='name']").val(data.name);
                        $("#editForm input[name='age']").val(data.age);
                        $("#editForm select[name='gender']").val(data.gender);
                        $("#editForm input[name='tel']").val(data.tel);
                        $("#editForm input[name='qq']").val(data.qq);
                        $("#editForm select[name='job_id']").val(data.job_id);
                        $("#editForm select[name='source_id']").val(data.source_id);
                    }
                })
            })

            //提交编辑表单
            $(function () {
                $(".inputSubmit").click(function () {
                    $("#editForm").ajaxSubmit(function (data) {
                        handResult(data);
                    })
                })
            })


            //跟进
            $(function () {
                $(".traceBtn").click(function () {

                    //弹出模态框
                    $("#traceModal").modal("show");
                    //数据复原
                    $("#traceForm")[0].reset();

                    //客户回显数据
                    var data = $(this).data("json");
                    if(data){
                        $("#traceForm input[name='customerId']").val(data.id);
                        $("#traceForm input[name='name']").val(data.name);
                        $("#traceForm input[name='type']").val(data.status);


                    }
                })


                $(".traceSubmit").click(function () {
                    $("#traceForm").ajaxSubmit(function (data) {
                        handResult(data);
                    })
                })
            })
            //移交
            $(function () {
                $(".transferBtn").click(function () {

                    //弹出模态框
                    $("#transferModal").modal("show");
                    //数据复原
                    $("#transferForm")[0].reset();

                    //客户回显数据
                    var data = $(this).data("json");
                    if(data){
                        $("#transferForm input[name='customerId']").val(data.id);
                        $("#transferForm input[name='customer.name']").val(data.name);
                        $("#transferForm input[name='oldsellerId']").val(data.sellerId);
                        $("#transferForm input[name='oldSeller.name']").val(data.sellerName);

                    }
                })


                $(".transferSubmit").click(function () {
                    $("#transferForm").ajaxSubmit(function (data) {
                        handResult(data);
                    })
                })
            })


            //吸纳
            $(function () {
                $(".absorbBtn").click(function () {

                    //弹出模态框
                    $("#absorbModal").modal("show");
                    //数据复原
                    $("#absorbForm")[0].reset();

                    //客户回显数据
                    var data = $(this).data("json");
                    if (data) {
                        console.log(data);
                        $("#absorbForm input[name='customerId']").val(data.id);
                        $("#absorbForm input[name='customer.name']").val(data.name);
                        $("#absorbForm input[name='oldsellerId']").val(data.sellerId);
                        $("#absorbForm input[name='oldSeller.name']").val(data.sellerName);

                    }
                })

                $(".absorbSubmit").click(function () {
                    $("#absorbForm").ajaxSubmit(function (data) {
                        handResult(data);
                    })
                })

            })


                //改变状态
            $(function () {
                $(".statusBtn").click(function () {

                    //弹出模态框
                    $("#statusModal").modal("show");
                    //数据复原
                    $("#statusForm")[0].reset();

                    //客户回显数据
                    var data = $(this).data("json");
                    if(data){
                        $("#statusForm input[name='customerId']").val(data.id);
                        $("#statusForm input[name='name']").val(data.name);
                    }
                })


                $(".statusSubmit").click(function () {
                    $("#statusForm").ajaxSubmit(function (data) {
                        handResult(data);
                    })
                })
            })

        </script>
    </head>



    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <#include "../common/navbar.ftl"/>
            <!--菜单回显-->
            <#assign currentMenu="customer_fail"/>
            <#include "../common/menu.ftl"/>
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>失败客户管理</h1>
                </section>
                <section class="content">
                    <div class="box">
                        <!--高级查询--->
                        <div style="margin: 10px;">
                            <!--高级查询--->
                            <form class="form-inline" id="searchForm" action="/customer/failList.do" method="post">
                                <input type="hidden" name="currentPage" id="currentPage" value="1">
                                <div class="form-group">
                                    <label for="keyword">关键字:</label>
                                    <input type="text" class="form-control" id="keyword" name="keyword" value="${(qo.keyword)!}" placeholder="请输入姓名/电话">
                                </div>
                                <div class="form-group">
                                    <label for="seller">市场专员:</label>
                                    <select class="form-control" id="seller" name="sellerId">
                                        <option value="-1">全部</option>
                                        <#list sellers as seller>
                                        <option value="${seller.id}">${seller.name}</option>
                                        </#list>
                                    </select>
                                    <script>
                                        $("#seller option[value='#{qo.sellerId}']").prop("selected", true);
                                    </script>
                                </div>
                                <button id="btn_query" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span> 查询</button>
                                <a href="JavaScript:;" class="btn btn-success inputBtn"><span class="glyphicon glyphicon-plus"></span>  添加</a>
                            </form>
                        </div>
                        <table class="table table-striped table-hover" >
                            <thead>
                            <tr>
                                <th>编号</th>
                                <th>名称</th>
                                <th>电话</th>
                                <th>QQ</th>
                                <th>职业</th>
                                <th>来源</th>
                                <th>销售员</th>
                                <th>状态</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                                <#list pageResult.list as entity>
                            <tr>
                                <td>${entity_index + 1}</td>
                                <td>${entity.name}</td>
                                <td>${entity.tel}</td>
                                <td>${entity.qq}</td>
                                <td>${entity.job.title}</td>
                                <td>${entity.source.title!}</td>
                                <td>${entity.seller.name}</td>
                                <td>${entity.statusType}</td>
                                <td>

<#--                                    <a class="btn btn-info btn-xs inputBtn"  data-json='${entity.jsonString}'>-->
<#--                                        <span class="glyphicon glyphicon-pencil"></span>编辑-->
<#--                                    </a>-->

                                    <a class="btn btn-primary btn-xs absorbBtn"  data-json='${entity.jsonString}'>
                                        <span class="glyphicon glyphicon-pencil"></span>吸纳
                                    </a>
                                    <@shiro.hasAnyRoles name="admin, Market_Manager">
                                    <a class="btn btn-warning btn-xs transferBtn"  data-json='${entity.jsonString}'>
                                        <span class="glyphicon glyphicon-pencil"></span>移交
                                    </a>
                                    </@shiro.hasAnyRoles>

<#--                                    <a class="btn btn-danger btn-xs statusBtn"  data-json='${entity.jsonString}'>-->
<#--                                        <span class="glyphicon glyphicon-pencil"></span>修改状态-->
<#--                                    </a>-->
                                </td>
                            </tr>
                                </#list>
                        </table>
                        <div style="text-align: center;">
                            <ul id="pagination" class="pagination"></ul>
                        </div>
<#--                            分页-->
                            <#include "../common/page.ftl"/>
                    </div>
                </section>
            </div>
            <#include "../common/footer.ftl"/>
        </div>

        <div id="absorbModal" class="modal fade" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">吸纳</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" action="/customerTransfer/absorb.do" method="post" id="absorbForm" style="margin: -3px 118px">
<#--                            <input type="hidden" name="id"/>-->
                            <input type="hidden" class="form-control" name="oldsellerId">
                            <input type="hidden" class="form-control" name="customerId">

                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">吸纳备注：</label>
                                <div class="col-sm-8">
                                    <textarea type="text" class="form-control" name="reason" cols="10"></textarea>
                                </div>
                            </div>

                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary absorbSubmit">保存</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->







        <div id="transferModal" class="modal fade" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">新增/编辑</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" action="/customerTransfer/saveOrUpdate.do" method="post" id="transferForm" style="margin: -3px 118px">
                            <input type="hidden" name="id" id="customerTransferId"/>
                            <div class="form-group" >
                                <label for="name" class="col-sm-4 control-label">客户姓名：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"  name="customer.name"   readonly >
                                    <input type="hidden" class="form-control"  name="customerId"  >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">旧营销人员：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control"  name="oldSeller.name" readonly >
                                    <input type="hidden" class="form-control"    name="oldsellerId"  >
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">新营销人员：</label>
                                <div class="col-sm-8">
                                    <select name="newsellerId" id="newSeller" class="form-control">
                                        <#list sellers as seller>
                                        <option value="${seller.id}">${seller.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">移交原因：</label>
                                <div class="col-sm-8">
                                    <textarea type="text" class="form-control" id="reason" name="reason" cols="10" ></textarea>
                                </div>
                            </div>

                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary transferSubmit" >保存</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary statusSubmit">保存</button>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
