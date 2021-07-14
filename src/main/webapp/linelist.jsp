<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                        <li><a href="/lvxs/line/selectall">线路管理</a></li>
                        <li class="active">线路信息</li>
                    </ol>
                </div>
            </div>
            <table class="table table-bordered table-hover">
                <thead>
                <th>线路编号</th>
                <th>出发地-目的地</th>
                <th>时间段（天）</th>
                <c:if test="${sessionScope.user.usercon==1}">
                    <th>操作</th>
                </c:if>
                </thead>
                <tbody>
                <c:forEach items="${lineinfo.list}" var="line">
                    <tr>
                        <td>${line.lineid}<br/></td>
                        <td>${line.lineap}-${line.linebp}</td>
                        <td>${line.lineday}<br/></td>
                        <c:if test="${sessionScope.user.usercon==1}">
                            <td>
                                <a>
                                    <input type="button" data-toggle="modal" data-target="#line-save-modal"
                                           onclick="updateline(${line.lineid},'${line.lineap}','${line.linebp}',
                                                   '${line.lineday}')"
                                           value="修改线路">
                                </a>
                                <a href="${pageContext.request.contextPath}/line/deline/${line.lineid}"><input
                                        type="button" value="删除线路"></a>
                            </td>
                        </c:if>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div>
                <a href="${pageContext.request.contextPath}/line/selectall?pageNo=1">首页</a>
                <a href="${pageContext.request.contextPath}/line/selectall?pageNo=${requestScope.lineinfo.prePage}">上一页</a>
                <a href="${pageContext.request.contextPath}/line/selectall?pageNo=${requestScope.lineinfo.nextPage}">下一页</a>
                <a href="${pageContext.request.contextPath}/line/selectall?pageNo=${requestScope.lineinfo.pages}">末页</a>
            </div>
        </div>
        <div class="modal fade" id="line-save-modal" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">线路修改</h4>
                    </div>
                    <div class="modal-body">
                        <form action="${pageContext.request.contextPath}/line/upl" method="post">
                            <input type="hidden" id="lineid" name="lineid" value="">
                            出发地：<input type="text" id="lap" name="lineap" value=""/><br/>
                            目的地：<input type="text" id="lbp" name="linebp" value=""/><br/>
                            时间段（天）：<input type="text" id="lday" id="lday" name="lineday" value="" style="width: 50px"/>天<br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="./commom/foot.jsp" %>
    <script type="text/javascript">
        $(function () {
            $("line-save-modal").modal("hide");
        });

        function updateline(lineid, lap, lbp, lday) {
            $("#lineid").val(lineid);
            $("#lap").val(lap);
            $("#lbp").val(lbp);
            $("#lday").val(lday);
        }
    </script>
</body>
</html>
