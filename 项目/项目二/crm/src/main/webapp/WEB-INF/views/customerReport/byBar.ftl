<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <script src="/js/plugins/echarts/echarts.common.min.js"></script>

    </head>
    <body>
        <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
        <div id="main" style="width: 600px;height:400px;"></div>
        <script type="text/javascript">
            var myChart = echarts.init(document.getElementById('main'));
            option = {
                title : {
                    text: '潜在客户报表',
                    subtext: '纯属真实'
                },
                tooltip : {
                    trigger: 'axis'
                },
                legend: {
                    data:['蒸发量','降水量']
                },
                toolbox: {
                    show : true,
                    feature : {
                        dataView : {show: true, readOnly: false},
                        magicType : {show: true, type: ['line', 'bar']},
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data : ${sellers}
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [

                    {
                        name:'潜在客户人数',
                        type:'bar',
                        data:${totals},
                        markPoint : {
                            data : [
                                {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183},
                                {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
                            ]
                        },
                        markLine : {
                            data : [
                                {type : 'average', name : '平均值'}
                            ]
                        }
                    }
                ]
            };



            myChart.setOption(option);
        </script>
    </body>
</html>

</html>
