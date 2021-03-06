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
                    subtext: "${qo.groupName()}",
                    x:'center'
                },
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    x : 'center',
                    y : 'bottom',
                    data: ${sellers}
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType : {
                            show: true,
                            type: ['pie', 'funnel']
                        },
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                series : [
                    {
                        name:'半径模式',
                        type:'pie',
                        radius : [20, 110],
                        center : ['25%', '50%'],
                        roseType : 'radius',
                        label: {
                            normal: {
                                show: false
                            },
                            emphasis: {
                                show: true
                            }
                        },
                        lableLine: {
                            normal: {
                                show: false
                            },
                            emphasis: {
                                show: true
                            }
                        },
                        data:${pieData}
                    },
                    {
                        name:'面积模式',
                        type:'pie',
                        radius : [30, 110],
                        center : ['75%', '50%'],
                        roseType : 'area',
                        data:${pieData}
                    }
                ]
            };

            myChart.setOption(option);
        </script>
    </body>
</html>

</html>
