<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>员工查询</title>
</head>
<body>
<div class="container-fluid">
    <%@ include file="../commom/head.jsp" %>
    <div class="lvxs_body" style="position:relative; top:-15px;">
        <%@ include file="../commom/leftsidebar.jsp" %>
        <div class="lvxs_info col-sm-10">
            <form action="${pageContext.request.contextPath}/staff/selectdata" method="post">
                <input type="text" placeholder="输入姓名或电话" name="mes">
                <button type="submit">查询</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
