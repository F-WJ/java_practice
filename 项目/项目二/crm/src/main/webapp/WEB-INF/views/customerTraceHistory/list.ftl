
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>跟进历史管理</title>
        <#include "../common/link.ftl"/>

        <script type="text/javascript">
            $(function () {
                $("#btn_query").click(function () {
                    $("#currentPage").val(1);
                    $("#searchForm").submit();
                });
            })
            //编辑
            $(function () {
                $(".inputBtn").click(function () {

                    //弹出模态框
                    $("#traceHistoryModal").modal("show");
                    //数据复原
                    $("#traceHistoryForm")[0].reset();

                    //客户回显数据
                    var data = $(this).data("json");
                    if (data) {
                        $("#inputTitle").html("客户编辑");
                        $("#traceHistoryForm input[name='id']").val(data.id);
                        $("#traceHistoryForm input[name='customerId']").val(data.customerId);
                        $("#traceHistoryForm input[name='customer.name']").val(data.customerName);
                        $("#traceHistoryForm input[name='traceTime']").val(data.traceTime);
                        $("#traceHistoryForm input[name='traceDetails']").val(data.traceDetails);
                        $("#traceHistoryForm select[name='traceTypeId']").val(data.traceTypeId);
                        $("#traceHistoryForm select[name='traceResult']").val(data.traceResult);
                        $("#traceHistoryForm textarea[name='remark']").val(data.remark);
                    }
                })
            })

            //提交编辑表单
            $(function () {
                $(".traceHistorySubmit").click(function () {
                    $("#traceHistoryForm").ajaxSubmit(function (data) {
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
            <#assign currentMenu="customerTraceHistory"/>
            <#include "../common/menu.ftl"/>
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>跟进历史管理</h1>
                </section>
                <section class="content">
                    <div class="box">
                        <!--高级查询--->
                        <div style="margin: 10px;">
                            <!--高级查询--->
                            <form class="form-inline" id="searchForm" action="/customerTraceHistory/list.do" method="post">
                                <input type="hidden" name="currentPage" id="currentPage">
                                <div class="form-group">
                                    <label for="keyword">关键字:</label>
                                    <input type="text" class="form-control" id="keyword" name="keyword" value="" placeholder="请输入姓名或电话">
                                </div>

                                <button id="btn_query" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span>查询</button>

                            </form>
                        </div>
                        <table class="table table-striped table-hover">
                            <thead>
                            <tr>
                                <th>编号</th>
                                <th>姓名</th>
                                <th>跟进日期</th>
                                <th>跟进内容</th>
                                <th>跟进方式</th>
                                <th>跟进结果</th>
                                <th>录入人</th>
                                <th>跟进类型</th>
                            </tr>
                            </thead>
                            <#list pageResult.list as entity>
                            <tr>
                                <td>${entity_index + 1}</td>
                                <td>${entity.customer.name}</td>
                                <td>${entity.traceTime?string('yyyy-MM-dd')}</td>
                                <td>${entity.traceDetails}</td>
                                <td>${entity.traceType.title}</td>
                                <td>${entity.resultType}</td>
                                <td>${(entity.inputUser.name)!}</td>
                                <td>${entity.statusType}</td>
                                <td>
                                    <a class="btn btn-info btn-xs inputBtn" data-json='${entity.jsonResult}'>
                                        <span class="glyphicon glyphicon-pencil"></span> 编辑
                                    </a>
                                </td>
                            </tr>
                        </#list>
                        </table>
                        <div style="text-align: center;">
                            <ul id="pagination" class="pagination"></ul>
                        </div>
                        <#include "../common/page.ftl"/>
                    </div>
                </section>
            </div>
            <#include "../common/footer.ftl"/>
        </div>

        <div id="traceHistoryModal" class="modal fade" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">新增/编辑</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" action="/customerTraceHistory/saveOrUpdate.do" method="post" id="traceHistoryForm"
                              style="margin: -3px 118px">
                            <input type="hidden" name="id" id="customerTraceHistoryId"/>
                            <div class="form-group">
                                <label for="name" class="col-sm-4 control-label">客户姓名：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" name="customer.name" readonly>
                                    <input type="hidden" class="form-control" name="customerId">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">跟进时间：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control " name="traceTime" ">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">跟进内容：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" name="traceDetails">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">跟进方式：</label>
                                <div class="col-sm-8">
                                    <select name="traceTypeId" class="form-control">
                                        <#list communicationMethod as cm>
                                        <option value="${cm.id}">${cm.title}</option>
                                        </#list>
                                    </select>

                                </div>
                            </div>
                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">跟进结果：</label>
                                <div class="col-sm-8">
                                    <select name="traceResult" class="form-control">
                                        <option value="3">优</option>
                                        <option value="2">中</option>
                                        <option value="1">差</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="sn" class="col-sm-4 control-label">备注：</label>
                                <div class="col-sm-8">
                            <textarea type="text" class="form-control" name="remark">
                            </textarea>
                                </div>
                            </div>


                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary traceHistorySubmit">保存</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

    </body>
</html>
