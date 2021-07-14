<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>旅行管理系统</title>
</head>
<body>
<div class="container-fluid">
    <%@ include file="./commom/head.jsp" %>
    <div class="lvxs_body" style="position:relative; top:-15px;">
        <%@ include file="./commom/leftsidebar.jsp" %>
        <div class="lvxs_info col-sm-10">
            <div class="panel panel-info icon-text-height">
                <div class="panel-heading">
                    <ol class="breadcrumb">
                        <li><a href="/lvxs/work/selectall">业务管理</a></li>
                        <li class="active">业务修改</li>
                    </ol>
                </div>
            </div>
            <table class="table table-bordered table-hover">
                <thead>
                <input type="hidden" value="${wk.workid}" name="workid" id="workid"/>
                <thead>
                <th>游客姓名<input type="text" id="cusname" value="${requestScope.wk.customer.customername}"
                               disabled="disabled"/></th>
                <th>游客电话<input type="text" id="cuspho" value="${requestScope.wk.customer.customerpho}"
                               disabled="disabled"/></th>
                <th>出发地-目的地
                    <select class="inputselect" name="workline" id="xx">
                        <c:forEach items="${requestScope.worklist}" var="r" varStatus="v">
                            <c:if test="${v.count!=requestScope.wk.line.lineid}">
                                <option value="${v.count}">${r.line.lineap}-${r.line.linebp}</option>
                            </c:if>
                            <c:if test="${v.count==requestScope.wk.line.lineid}">
                                <option value="${v.count}"
                                        selected="selected">${r.line.lineap}-${r.line.linebp}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                </th>
                <th>出发日期<input id="worktime" class="Wdate"
                               onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" name="worktime"
                               value="<fmt:formatDate value="${requestScope.wk.worktime}" pattern="yyyy-MM-dd"/>"/></th>
                <th>出游状态
                    <select id="workstatus">
                        <option value="0">未出游</option>
                        <option value="1">已出游</option>
                    </select></th>
                <th>结算日期<input id="workday" class="Wdate"
                               onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" name="workday"
                               value="<fmt:formatDate value="${requestScope.wk.workday}" pattern="yyyy-MM-dd"/>"/></th>
                <th>费用<input type="text" id="wmoney" value="${requestScope.wk.workmoney}" size="5px"/></th>
                <th><input type="button" value="保存" onclick="upwk()"/></th>
                </tr>
                </thead>
            </table>
            <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
            <script type="text/javascript"
                    src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
            <script type="text/javascript">
                function upwk() {
                    var workid = document.getElementById("workid").value;
                    var worktime = document.getElementById("worktime").value;
                    var workstatus = document.getElementById("workstatus").value;
                    var lid = $("#xx").find("option:selected").val();
                    var workday = document.getElementById("workday").value;
                    var workmoney = document.getElementById("wmoney").value;
                    var data1 = JSON.stringify({
                        "workid": workid,
                        "lid": lid,
                        "workmoney": workmoney,
                        "worktime": worktime,
                        "workday": workday,
                        "workstatus": workstatus
                    })
                    $.ajax({
                        url: "/lvxs/work/upwork",
                        type: "post",
                        data: data1,
                        contentType: "application/json",
                        success: function (result) {
                            if (result) {
                                window.location.href = "${pageContext.request.contextPath}/work/selectall"
                            } else {
                                alert("no");
                            }
                        }
                    });
                }
            </script>
        </div>
</body>
</html>
