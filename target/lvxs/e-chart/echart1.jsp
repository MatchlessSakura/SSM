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
    <title>登陆业务汇总表</title>
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
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '登陆业务统计表'
        },
        tooltip: {},
        legend: {
            data: ['登记人数']
        },
        xAxis: {
            name: '月份',
            data: [
                <c:forEach var="i" begin="0" end="${worklist.size()}">'${worklist[i].work_date}', </c:forEach>
            ],
        },
        yAxis: {
            name:'人数/人'
        },
        series: [{
            name: '登记人数',
            type: 'bar',
            data: [<c:forEach var="i" begin="0" end="${worklist.size()}"> '${worklist[i].count}', </c:forEach>
            ]
        }],
    };
    myChart.setOption(option);
</script>
</html>