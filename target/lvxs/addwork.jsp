<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>业务添加</title>
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
                        <li class="active">业务添加</li>
                    </ol>
                </div>
            </div>
            <table class="table table-bordered table-hover">
                <thead>
                <th>游客姓名：<input type="text" id="cusname"/></th>
                <th>游客电话：<input type="text" placeholder="11位电话" id="cuspho"/></th>
                <th>出发地-目的地
                    <select class="inputselect" name="workline" id="xx">
                        <option selected="selected">未选择</option>
                        <c:forEach items="${requestScope.worklist}" var="r">
                            <option value="${r.line.lineid}">${r.line.lineap}-${r.line.linebp}</option>
                        </c:forEach>
                    </select>
                </th>
                <th>出发时间：<input id="worktime" class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"
                                name="worktime"/></th>
                <th>费用：<input type="text" placeholder="费用" id="wmoney"/></th>
                <th><input type="button" value="保存" onclick="addwk()"/></th>
                </tr>
                </thead>
            </table>
        </div>
    </div>
</div>
<%@ include file="./commom/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
    function addwk() {
        var cname = document.getElementById("cusname").value;
        var cpho = document.getElementById("cuspho").value;
        var worktime = document.getElementById("worktime").value;
        var lid = $("#xx").find("option:selected").val();
        var workmoney = document.getElementById("wmoney").value;
        var data1 = JSON.stringify({
            "cname": cname,
            "cpho": cpho,
            "lid": lid,
            "workmoney": workmoney,
            "worktime": worktime
        })
        $.ajax({
            url: "/lvxs/work/addwork",
            type: "post",
            data: data1,
            contentType: "application/json",
            success: function (result) {
                if (result) {
                    window.location.href = "${pageContext.request.contextPath}/work/selectall";
                    alert("ok");
                } else {
                    // alert("no");
                }
            }
        });
    }
</script>
</body>
</html>
