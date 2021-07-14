<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>旅行社管理系统</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
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
                        <li><a href="/lvxs/work/selectall">业务信息管理</a></li>
                        <li class="active">业务信息</li>
                    </ol>
                </div>
            </div>
            <table class="table table-bordered table-hover">
                <thead>
                <th>游客姓名</th>
                <th>游客电话</th>
                <th>出发地-目的地</th>
                <th>出发日期</th>
                <th>出游状态</th>
                <th>结算日期</th>
                <th>费用</th>
                <th>操作</th>
                </thead>
                <tbody>
                <c:forEach items="${requestScope.workinfo.list}" var="work">
                    <tr>
                        <td>${work.customer.customername}<br/></td>
                        <td>${work.customer.customerpho}<br/></td>
                        <td>${work.line.lineap}-${work.line.linebp}</td>
                        <td><fmt:formatDate value="${work.worktime}" pattern="yyyy-MM-dd"/><br/></td>
                        <td>
                            <c:if test="${work.workstatus==0}">
                                未出游
                            </c:if>
                            <c:if test="${work.workstatus==1}">
                                已出游
                            </c:if>
                            <br/></td>
                        <td><fmt:formatDate value="${work.workday}" pattern="yyyy-MM-dd"/><br/></td>
                        <td>${work.workmoney}<br/></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/work/selectworkbyid/${work.workid}"><input
                                    type="button" value="修改"/></a>
                            <a href="${pageContext.request.contextPath}/work/dework/${work.workid}"><input type="button"
                                                                                                           value="删除"/></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div>
                <a href="${pageContext.request.contextPath}/work/selectall?pageNo=1">首页</a>
                <a href="${pageContext.request.contextPath}/work/selectall?pageNo=${requestScope.workinfo.prePage}">上一页</a>
                <a href="${pageContext.request.contextPath}/work/selectall?pageNo=${requestScope.workinfo.nextPage}">下一页</a>
                <a href="${pageContext.request.contextPath}/work/selectall?pageNo=${requestScope.workinfo.pages}">末页</a>
            </div>
        </div>
    </div>
    <%@ include file="./commom/foot.jsp" %>
    <script type="text/javascript">
        function updatework() {
            var workid = document.getElementById("workid").value;
            var worktime = document.getElementById("worktime").value;
            var lid = $("#xx").find("option:selected").val();
            var workmoney = document.getElementById("wmoney").value;
            var data1 = JSON.stringify({"workid": workid, "lid": lid, "workmoney": workmoney, "worktime": worktime})
            $.ajax({
                url: "work/upwork",
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
</body>
</html>
