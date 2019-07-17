<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>部门管理</title>
<#include "../common/link.ftl"/>
    <script>
        $(function () {
            $('.btn-input').click(function () {
                //获取部门信息
                var json = $(this).data("json");
                console.log(json);
                //回显部门信息
                if(json){
                 $('input[name=id]').val(json.id);
                 $('input[name=name]').val(json.name);
                 $('input[name=sn]').val(json.sn);
                }

                $('#editModal').modal("show");
            });

            $('.submitBtn').click(function () {
                //提交， 跳到信息框
                $('#editForm').ajaxSubmit(function (data) {
                    console.log(data);
                    if(data.success){
                        //jquery-bootstrap消息提示插件
                        $.messager.alert("提示", "操作成功");
                        //定时器
                        setTimeout(function () {
                            window.location.reload();
                        }, 2000);

                    }else{
                        $.messager.alert("提示",data.msg);
                    }
                })
            });




            $.messager.model = {
                ok:{ text: "确认" },
                cancel: { text: "取消"}
            };

            $(".btn_delete").click(function () {
                //获取数据
                var url = $(this).data("url");
                console.log(url);
                $.messager.confirm("提示", "要删除数据吗", function() {
                    //发送ajax
                    $.get(url, function (data) {
                        console.log(data);
                        if(data.success){
                            $.messager.alert("提示", "删除成功");
                            //定时器
                            setTimeout(function () {
                                window.location.reload();
                            }, 2000);
                        }else{
                            $.messager.alert("提示", data.msg);
                        }

                    })
                });
            })



        })
    </script>

</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
<#include "../common/navbar.ftl"/>
    <!--菜单回显-->
<#assign currentMenu="department"/>
<#include "../common/menu.ftl"/>
    <div class="content-wrapper">
        <section class="content-header">
            <h1>部门管理</h1>
        </section>
        <section class="content">
            <div class="box">
                <!--高级查询--->
                <form class="form-inline" id="searchForm" action="/department/list.do" method="post">
                    <input type="hidden" name="currentPage" id="currentPage" value="1">
                    <a href="javascript:;" class="btn btn-success btn-input" style="margin: 10px">
                        <span class="glyphicon glyphicon-plus"></span> 添加
                    </a>
                </form>
                <!--编写内容-->
                <div class="box-body table-responsive no-padding ">
                    <table class="table table-hover table-bordered">
                        <tr>
                            <th>编号</th>
                            <th>部门名称</th>
                            <th>部门编号</th>
                            <th>操作</th>
                        </tr>
                    <#--list,要遍历的集合 as 变量-->
                    <#list pageResult.list as entity>
                        <tr>
                        <#--从0开始,需要加1-->
                            <td>${entity_index + 1}</td>
                            <td>${entity.name}</td>
                            <td>${entity.sn}</td>
                            <td>
                                <a class="btn btn-info btn-xs btn-input" href="javascript:;"  data-json='${entity.jsonString}'>
                                    <span class="glyphicon glyphicon-pencil"></span> 编辑
                                </a>
                                <a href="javascript:;" data-url="/department/delete.do?id=${entity.id}"
                                   class="btn btn-danger btn-xs btn_delete">
                                    <span class="glyphicon glyphicon-trash"></span> 删除
                                </a>
                            </td>
                        </tr>
                    </#list>
                    </table>
                    <!--分页-->
                <#include "../common/page.ftl"/>
                </div>
            </div>
        </section>
    </div>
<#include "../common/footer.ftl"/>
</div>

    <#--部门编辑模态框-->
    <div class="modal fade" id="editModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span> </button>
                    <h4 class="modal-title">部门添加/编辑</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" action="/department/saveOrUpdate.do" method="post" id="editForm">
                        <input type="hidden" value="" name="id">
                        <div class="form-group" >
                            <label  class="col-sm-3 control-label">部门名称：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="name" value="" placeholder="请输入部门名称">
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-3 control-label">部门编号：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"  name="sn" value="" placeholder="请输入部门编号">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary submitBtn" >保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
                </div>
            </div>
        </div>
    </div>


</body>
</html>

