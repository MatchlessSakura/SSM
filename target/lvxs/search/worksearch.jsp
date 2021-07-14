<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<html>
<head>
    <title>业务查询</title>
</head>
<body>
<div class="container-fluid">
    <%@ include file="../commom/head.jsp" %>
    <div class="lvxs_body" style="position:relative; top:-15px;">
        <%@ include file="../commom/leftsidebar.jsp" %>
        <div class="lvxs_info col-sm-10">
            <form action="${pageContext.request.contextPath}/work/selectall" method="post">
                <select name="id" onchange="changersearch(this)">
                    <option value="0">结算日期查询</option>
                    <option value="1">出游状态查询</option>
                    <option value="2">已结算</option>
                    <option value="3">未结算</option>
                </select>
                <input class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" name="workday"/>
                <select name="workstatus" style="display: none;" disabled="disabled">
                    <option value="0">未确认出游</option>
                    <option value="1">已确认出游</option>
                </select>
                <button type="submit">查询</button>
            </form>
        </div>
    </div>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
    var type = '${search["id"]}';
    $(function () {
        if (type == '') type = 0;
        $("[name=id]").val(type)
        if (type == 1) {
            $("[name=workstatus]").css("display", "inline").removeAttr("disabled");
            $("[name=workday]").css("display", "none").attr("disabled", "disabled");
        } else if (type == 2) {
            $("[name=workstatus]").css("display", "none").attr("disabled", "disabled");
            $("[name=workday]").css("display", "none").attr("disabled", "disabled");
        } else if (type == 3) {
            $("[name=workstatus]").css("display", "none").attr("disabled", "disabled");
            $("[name=workday]").css("display", "none").attr("disabled", "disabled");
        }
    });

    function changersearch(o) {
        var type = $(o).val();
        if (type == 0) {
            $("[name=workday]").css("display", "inline").removeAttr("disabled");
            $("[name=workstatus]").css("display", "none").attr("disabled", "disabled");
        } else if (type == 1) {
            $("[name=workstatus]").css("display", "inline").removeAttr("disabled");
            $("[name=workday]").css("display", "none").attr("disabled", "disabled");
        } else if (type == 2) {
            $("[name=workstatus]").css("display", "none").attr("disabled", "disabled");
            $("[name=workday]").css("display", "none").attr("disabled", "disabled");
        } else if (type == 3) {
            $("[name=workstatus]").css("display", "none").attr("disabled", "disabled");
            $("[name=workday]").css("display", "none").attr("disabled", "disabled");
        }
    }

</script>
</body>
</html>
