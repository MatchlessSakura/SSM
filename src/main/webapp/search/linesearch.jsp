<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>线路查询</title>
</head>
<body>
<div class="container-fluid">
    <%@ include file="../commom/head.jsp" %>
    <div class="lvxs_body" style="position:relative; top:-15px;">
        <%@ include file="../commom/leftsidebar.jsp" %>
        <div class="lvxs_info col-sm-10">
            <form action="${pageContext.request.contextPath}/line/selectall" method="post">
                <select name="id" onchange="changersearch(this)">
                    <option value="0">城市查询</option>
                    <option value="1">天数查询</option>
                </select>
                <input name="lineap" value="">
                <input name="lineday" style="display: none;" disabled="disabled" value="">
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
            $("[name=lineday]").css("display", "inline").removeAttr("disabled");
            $("[name=lineap]").css("display", "none").attr("disabled", "disabled");
        }
    });

    function changersearch(o) {
        var type = $(o).val();
        if (type == 0) {
            $("[name=lineap]").css("display", "inline").removeAttr("disabled");
            $("[name=lineday]").css("display", "none").attr("disabled", "disabled");
        } else {
            $("[name=lineday]").css("display", "inline").removeAttr("disabled");
            $("[name=lineap]").css("display", "none").attr("disabled", "disabled");
        }
    }
</script>
</body>
</html>
