<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>叩丁狼骡窝窝后台管理系统</title>
    <#include "../common/header.ftl" >
    <link rel="stylesheet" href="/jquery/plugins/treeview/bootstrap-treeview.min.css" type="text/css" />
    <script type="text/javascript" src="/jquery/plugins/treeview/bootstrap-treeview.min.js"></script>

    <script>

        $(function () {
            //获取所有信息
            $.get('/region/listByParentId', function (data) {
                var defaultData = [
                    {
                        text: '全部地区',
                        nodes: data
                    }
            ]


                //调用插件
                $("#tree").treeview({
                    showTags: true,
                    data: defaultData,
                    lazyLoad: function (node) {
                        $.get('/region/listByParentId', {parentId: node.id}, function (data) {
                            $('#tree').treeview('addNode', [data, node])
                        })
                    },
                    onNodeSelected: function(event, data) {//选中节点的事件
                        $.get("/region/listByParentId.do",{parentId:data.id},function (data) {
                            $("#regionTb tbody").empty();
                            $.each(data,function (index, ele) {
                                console.log(ele);
                                var tr = $("#template tr").clone(true); //清空
                                //设置对应的值
                                $(tr).find("td:nth-child(1)").html(index+1);
                                $(tr).find("td:nth-child(2)").html(ele.text);
                                $(tr).find("a").attr("data-json",ele.result);

                                // 判断地区的状态(如果是推荐的状态)
                                if(ele.states == 1){
                                    $(tr).find("a:last").html("<span class=\"glyphicon glyphicon-trash\"></span>取消推荐");
                                }

                                $("#regionTb tbody").append(tr);
                            })

                        })
                    }

                });

            })

            //新增/编辑
            $(".btn-input").click(function () {
                console.log(3);
                var json = $(this).data('json');
                //编辑
                if(json){
                    $("input[name='id']").val(json.id);
                    $("#name").val(json.name);
                    $("#parentName").val(json.parentName);
                    $("#parentId").val(json.parentId);
                    $("#state").val(json.state);
                }else{
                    //新增
                    //获取选中的节点数据数组
                    var selected = $('#tree').treeview('getSelected');
                    console.log(selected);
                    if(selected.length > 0){
                        //回显到模态窗
                        $("#parentName").val(selected[0].text);
                        $("#parentId").val(selected[0].id);
                    }
                }
                $("#inputModal").modal('show');
            });

            //提交表单
            $(".btn-submit").click(function () {
                //将表单的提交方式修改为ajax异步提交
                $("#editForm").ajaxSubmit(function (data) {
                    if(data.success){
                        $.messager.alert("温馨提示","操作成功,2S之后关闭");
                        setTimeout(function () {
                            window.location.reload();
                        },2000);
                    }
                })
            });

            //推荐/取消推荐按钮
            $(".btn-hot").click(function () {
                var json = $(this).data('json');
                var state = 1;
                //在前台就修改好要保存的状态
                if(json.state==1){
                    state = 0;
                }
                $.post('/region/changeState.do',{id:json.id,state:state},function (data) {
                    if(data.success){
                        $.messager.alert("温馨提示","操作成功,2S之后关闭");
                        setTimeout(function () {
                            //刷新页面
                            window.location.reload();
                        },2000);
                    }
                })
            })



        })


    </script>
</head>
<body>
    <table id="template" style="display: none">
    <tr>
        <td></td>
        <td></td>
        <td>
            <a class="btn btn-info btn-xs btn-input" >
                <span class="glyphicon glyphicon-pencil"></span>编辑
            </a>

            <a class="btn btn-danger btn-xs btn-hot" >
                <span class="glyphicon glyphicon-trash"></span>设为推荐
            </a>
        </td>
    </tr>
</table>

<div class="container " style="margin-top: 20px">
    <#include "../common/top.ftl">
    <div class="row">
        <div class="col-sm-3">
            <#assign currentMenu="region"/>
            <#include "../common/menu.ftl">
        </div>
        <div class="col-sm-9">
            <div class="row">
                <div class="col-sm-12">
                    <h1 class="page-head-line">地区管理</h1>
                </div>
            </div>
            <!--高级查询, 添加之后再查询--->
            <form class="form-inline" id="searchForm" action="/region/list.do" method="post">
<#--                <input type="hidden" name="currentPage" id="currentPage" value="1">-->
                <a href="javascript:;" class="btn btn-success btn-input" >添加</a>
            </form>


            <div class="row">
                <div class="col-sm-4">
                    <div id="tree"></div>
                </div>
                <div class="col-sm-8">
                    <table class="table table-striped table-hover" id="regionTb">
                        <thead>
                        <tr>
                            <th>编号</th>
                            <th>名称</th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>
            </div>




        </div>
    </div>
</div>


    <#--编辑模态框-->
    <div class="modal fade" id="inputModal" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title">编辑</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" action="/region/saveOrUpdate.do" method="post" id="editForm">
                        <input type="hidden" name="id">
                        <input type="hidden" id="state" name="state">
                        <div class="form-group">
                            <label for="name" class="col-sm-4 control-label">名称：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="name" name="name"
                                       placeholder="请输入地区名称">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sn" class="col-sm-4 control-label">上级地区：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="parentName" name="parentName" readonly>
                                <input type="hidden" class="form-control" id="parentId" name="parentId" >
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary btn-submit">保存</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</body>
</html>