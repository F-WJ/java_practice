
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>部门管理</title>
        <#include "../common/link.ftl"/>
        <script type="text/javascript">
            $(function(){
                // 点击图表时打开视图窗口
                $(".chart_btn").click(function () {
                    // // 将序列化后的参数,拼接到url中
                    var url = $(this).data("url") + "?" + $("#searchForm").serialize();
                    // var url = $(this).data("url");
                    // window.location.href = url;
                    // var name = $(this).val();

                    // 使用弹窗显示图表数据
                    //modal初始化和打开之前清除页面内容和缓存数据
                    $('#chartModal .modal-content').empty();
                    $('#chartModal').removeData('bs.modal').modal({
                        remote: url
                    });

                });
            });
        </script>
    </head>


    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <#include "../common/navbar.ftl"/>
            <!--菜单回显-->
            <#assign currentMenu="customerReport"/>
            <#include "../common/menu.ftl"/>
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>潜在客户报表</h1>
                </section>
                <section class="content">
                    <div class="box">
                        <!--高级查询--->
                        <div style="margin: 10px;">
                            <!--高级查询--->
                            <form class="form-inline" id="searchForm" action="/customerReport/list.do" method="post">
                                <input type="hidden" name="currentPage" id="currentPage" value="1">
                                <div class="form-group">
                                    <label for="keyword">员工姓名:</label>
                                    <input type="text" class="form-control" id="keyword" name="keyword" value="${(qo.keyword)!}" placeholder="请输入姓名">
                                </div>
                                <div class="form-group">
                                    <label for="date">时间段查询:</label>
                                    <input type="text" class="form-control" style="width: 100px" id="beginTime" name="beginDate"  value=""> -
                                    <input type="text" class="form-control" style="width: 100px" id="endTime" name="endDate"  value="">
                                </div>
                                <div class="form-group">
                                    <label for="status">分组类型:</label>
                                    <select class="form-control" id="groupType" name="groupType">
                                        <option value="seller.name"
                                                selected
                                        >
                                            员工
                                        </option>
                                        <option value="DATE_FORMAT(c.input_time, '%Y')"
                                        >
                                            年
                                        </option>
                                        <option value="DATE_FORMAT(c.input_time, '%Y-%m')"
                                        >
                                            月
                                        </option>
                                        <option value="DATE_FORMAT(c.input_time, '%Y-%m-%d')"
                                        >
                                            日
                                        </option>
                                    </select>
                                    <button id="btn_query" class="btn btn-primary">
                                        <span class="glyphicon glyphicon-search"></span> 查询
                                    </button>
                                    <button type="button" class="btn btn-info chart_btn" data-url="/customerReport/chartByBar.do">
                                        <span class="glyphicon glyphicon-stats"></span> 柱状图
                                    </button>
                                    <button type="button" class="btn btn-warning chart_btn"  data-url="/customerReport/chartByPie.do">
                                        <span class="glyphicon glyphicon-dashboard"></span> 饼状图
                                    </button>
                                </div>
                            </form>
                        </div>
                        <table class="table table-striped table-hover" >
                            <thead>
                            <tr>
                                <th>分组类型</th>
                                <th>潜在客户新增数</th>
                            </tr>
                            </thead>
                            <#list datas as data>
                            <tr>
                                <td>${data.groupType}</td>
                                <td>${data.total}</td>
                            </tr>
                            </#list>
                        </table>
                        <div style="text-align: center;">
                            <ul id="pagination" class="pagination"></ul>
                        </div>

                    </div>
                </section>
            </div>
            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 1.0.0
                </div>
                <strong>Copyright &copy; 2016-2019 <a href="http://www.wolfcode.cn">叩丁狼</a>.</strong> All rights
                reserved.
            </footer>
        </div>
        <div id="chartModal" class="modal fade" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">

                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

    </body>
</html>
