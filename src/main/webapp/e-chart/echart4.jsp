<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/echarts.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <title>期间结算汇总表</title>
</head>
<body>
<div class="container-fluid">
    <%@ include file="../commom/head.jsp" %>
    <div class="lvxs_body" style="position:relative; top:-15px;">
        <%@ include file="../commom/leftsidebar.jsp" %>
        <div class="lvxs_info col-sm-10">
            <div id="main" style="width: 600px;height:400px;"></div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
    var option = {
        title: {
            text: '期间结算统计表'
        },
        legend: {
            orient : 'vertical',
            x : 'right',
            data:['第一季度','第二季度','第三季度','第四季度']
        },
        tooltip: {},
        yAxis: [],
        series: [{
            name: '期间结算统计表',
            type: 'pie',
            data: [{value:'0',name:'第一季度'},
                {value:'0',name:'第二季度'},
                {value:'${worklist[0].work_money}',name:'第三季度'},
                {value:'${worklist[1].work_money}',name:'第四季度'},
            ]
        }
        ]
    };
    myChart.setOption(option);
</script>
</html>