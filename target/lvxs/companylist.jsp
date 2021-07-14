<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<html>
<head>
    <title>旅行社管理系统</title>
</head>
<body>
<div class="container-fluid">
    <!-- 导航条 -->
    <%@ include file="./commom/head.jsp" %>
    <!-- 中间部分（包括左边栏和表单显示部分） -->
    <div class="lvxs_body" style="position:relative; top:-15px;">
        <!-- 左侧栏 -->
        <%@ include file="./commom/leftsidebar.jsp" %>
        <div class="lvxs_info col-sm-10">
            <div class="panel panel-info icon-text-height"><!--框颜色-->
                <!-- 路径导航 -->
                <div class="panel-heading"><!--头部标签-->
                    <ol class="breadcrumb"><!--逐级显示标签-->
                        <li><a href="#">基础信息管理</a></li>
                        <li class="active">旅行社信息</li>
                    </ol>
                </div>
            </div>
            <table class="table table-bordered table-hover">
                <thead>
                <th>旅行社名称</th>
                <th>旅行社电话</th>
                <th>旅行社地址</th>
                <th>旅行社介绍</th>
                <c:if test="${sessionScope.user.usercon==1}">
                    <th>操作</th>
                </c:if>
                </thead>
                <tbody>
                <c:forEach items="${companylist}" var="company">
                    <tr>
                        <td>${company.comname}<br/></td>
                        <td>${company.compho}<br/></td>
                        <td>${company.comaddress}<br/></td>
                        <td style="word-break: break-all; width: 400px">${company.cominfo}<br/></td>
                        <c:if test="${sessionScope.user.usercon==1}">
                            <td>
                                <a>
                                    <input type="button" data-toggle="modal"
                                           data-target="#com-save-modal"
                                           onclick="updatecom(${company.comid},'${company.comname}','${company.compho}','${company.comaddress}','${company.cominfo}')"
                                           value="修改">
                                </a>
                            </td>
                        </c:if>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="modal fade" id="com-save-modal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">修改旅行社信息</h4>
                    </div>
                    <div class="modal-body">
                        <form action="${pageContext.request.contextPath}/company/upcp" method="post">
                            <input type="hidden" id="comid" name="comid" value="">
                            旅行社名称：<input type="text" id="comname" name="comname" value=""/><br/>
                            旅行社电话：<input type="text" id="compho" placeholder="11位电话" name="compho" value=""/><br/>
                            旅行社地址：<input type="text" id="comaddress" name="comaddress" value=""/><br/>
                            旅行社介绍：<textarea id="cominfo" name="cominfo"></textarea>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div>
        <%@ include file="./commom/foot.jsp" %>
        <script type="text/javascript">
            $(function () {
                $("com-save-modal").modal("hide");
            });

            function updatecom(comid, comname, compho, comaddress, cominfo) {
                $("#comid").val(comid);
                $("#comname").val(comname);
                $("#compho").val(compho);
                $("#comaddress").val(comaddress);
                $("#cominfo").val(cominfo);
            }
        </script>
</body>

</html>
