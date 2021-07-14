<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>数据统计</title>
    <link rel="stylesheet" href="../css/index.css"/>
</head>
<body>
<header>
    <div style="font-size: 30px; color: white; margin-left: 650px">旅行社信息展示</div>
    <a href="${pageContext.request.contextPath}/main.jsp"><div style="font-size: 20px; color: white">返回系统</div></a>
    <div class="showTime">当前时间：2021年7月7-16时33分33秒</div>
    <!--    时间显示-->
    <script>
        var t = null;
        t = setTimeout(time, 1000); //開始运行
        function time() {
            clearTimeout(t); //清除定时器
            dt = new Date();
            var y = dt.getFullYear();
            var mt = dt.getMonth() + 1;
            var day = dt.getDate();
            var h = dt.getHours(); //获取时
            var m = dt.getMinutes(); //获取分
            var s = dt.getSeconds(); //获取秒
            document.querySelector(".showTime").innerHTML =
                "当前时间：" +
                y +
                "年" +
                mt +
                "月" +
                day +
                "-" +
                h +
                "时" +
                m +
                "分" +
                s +
                "秒";
            t = setTimeout(time, 1000); //设定定时器，循环运行
        }
    </script>
</header>
<section class="mainbox">
    <!--    左边-->
    <div class="column">
        <div class="panel bar">
            <h2>登陆业务汇总表</h2>
            <div id="bar" style="height: 250px;"></div>
            <div class="panel-footer"></div>
        </div>
        <div class="panel bar1">
            <h2>确认出游汇总表</h2>
            <div id="bar1" style="height: 250px;"></div>
            <div class="panel-footer"></div>
        </div>
    </div>
    <!--    中间大图-->
    <div class="column">
        <div class="map" style="height: 520px;">
            <div class="chart" style="height: 520px;"></div>
            <div class="map1"></div>
            <div class="map2"></div>
            <div class="map3"></div>
        </div>
    </div>
    <!--    右边-->
    <div class="column">
        <div class="panel line">
            <h2>业务结算汇总表</h2>
            <div id="line" style="height: 250px;"></div>
            <div class="panel-footer"></div>
        </div>
        <div class="panel pie">
            <h2>周期结算汇总表</h2>
            <div id="pie" style="height: 230px;"></div>
            <div class="panel-footer"></div>
        </div>
    </div>
</section>
<script src="../js/flexible.js"></script>
<script src="../js/jquery.min.js"></script>
<script src="../js/echarts.min.js"></script>
<script src="../js/china.js"></script>
<script src="../js/myMap.js"></script>

</body>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('bar'));
    // 指定图表的配置项和数据
    var option = {
        title: {},
        tooltip: {},
        legend: {
            data: ['登记人数']
        },
        xAxis: {
            name: '月份',
            nameTextStyle: {
                color: 'white',
            },
            data: ['07月', '08月', '09月'],
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
        yAxis: {
            name: '人数/人',
            nameTextStyle: {
                color: 'white',
            },
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
        series: [{
            name: '登记人数',
            type: 'bar',
            data: [6, 2, 1],
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        }],
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('bar1'));
    var option = {
        title: {},
        tooltip: {},
        legend: {
            data: ['已出游', '未出游']
        },
        xAxis: {
            name: '月份',
            nameTextStyle: {
                color: 'white',
            },
            data: ['07月', '08月', '09月'],
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
        yAxis: {
            name: '人数/人',
            nameTextStyle: {
                color: 'white',
            },
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
        series: [{
            name: '未出游',
            type: 'bar',
            data: [5, 2, 1],
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
            {
                name: '已出游',
                type: 'bar',
                data: [1, 0, 0],
                color: '#009999',
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: 'white'
                    }
                }
            }
        ]
    };
    myChart.setOption(option);
</script>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('line'));
    var option = {
        title: {},
        tooltip: {},
        legend: {
            data: ['单数', '金额']
        },
        xAxis: {
            name: '月份',
            nameTextStyle: {
                color: 'white',
            },
            data: ['07月', '08月', '09月', '11月'],
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
        yAxis: [{
            type: 'value',
            scale: true,
            yAxisIndex: 0,
            min: 0,
            name: '金额/元',
            nameTextStyle: {
                color: 'white',
            },
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
            {
                type: 'value',
                scale: true,
                min: 0,
                name: '单数/单',
                nameTextStyle: {
                    color: 'white',
                },
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: 'white'
                    }
                }
            }],
        series: [{
            name: '金额',
            type: 'line',
            yAxisIndex: 0,
            color: 'red',
            data: [1310, 350, 200, 250],
            axisLabel: {
                show: true,
                textStyle: {
                    color: 'white'
                }
            }
        },
            {
                name: '单数',
                type: 'bar',
                yAxisIndex: 1,
                color: '#009999',
                data: [5, 2, 1, 1],
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: 'white'
                    }
                }
            }
        ]
    };
    myChart.setOption(option);
</script>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('pie'));
    var option = {
        title: {},
        legend: {
            orient: 'vertical',
            x: 'right',
            data: ['第一季度', '第二季度', '第三季度', '第四季度']
        },
        tooltip: {},
        yAxis: [],
        series: [{
            type: 'pie',
            // radius: '55%',
            data: [{value: '0', name: '第一季度'},
                {value: '0', name: '第二季度'},
                {value: '1860', name: '第三季度'},
                {value: '250', name: '第四季度'},
            ]
        }
        ]
    };
    myChart.setOption(option);
</script>
</html>
