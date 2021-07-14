<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<html>
<head>
    <title>旅行社管理系统</title>
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
                        <li><a href="#">用户信息管理</a></li>
                        <li class="active">用户信息</li>
                    </ol>
                </div>
            </div>
            <table class="table table-bordered table-hover">
                <thead>
                <th>用户编号</th>
                <th>用户账号</th>
                <th>用户密码</th>
                <th>用户控制权</th>
                <th>操作</th>
                </thead>
                <tbody>
                <c:forEach items="${userinfo.list}" var="user">
                    <tr>
                        <td>${user.userid}</td>
                        <td>${user.username}</td>
                        <td>${user.userpassword}</td>
                        <td>${user.usercon}</td>
                        <td>
                            <a>
                                <input type="button" data-toggle="modal"
                                       data-target="#user-save-modal"
                                       onclick="updatepwd(${user.userid},'${user.userpassword}')" value="更改密码"/>
                            </a>
                            <a href="${pageContext.request.contextPath}/user/deleteuser/${user.userid}"><input
                                    type="button" value="删除用户"/>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div>
                <a href="${pageContext.request.contextPath}/user/selectall?pageNo=1">首页</a>
                <a href="${pageContext.request.contextPath}/user/selectall?pageNo=${requestScope.userinfo.prePage}">上一页</a>
                <a href="${pageContext.request.contextPath}/user/selectall?pageNo=${requestScope.userinfo.nextPage}">下一页</a>
                <a href="${pageContext.request.contextPath}/user/selectall?pageNo=${requestScope.userinfo.pages}">末页</a>
            </div>
            <div class="modal fade" id="user-save-modal" tabindex="-1">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title">修改密码</h4>
                        </div>
                        <div class="modal-body">
                            <form action="${pageContext.request.contextPath}/user/upuser" method="post">
                                <input type="hidden" id="userid" name="userid" value=""/>
                                原密码：<input type="text" id="psd" name="pwd" value="" disabled="disabled">
                                新密码：<input type="text" name="userpassword"/><br/>
                                <button type="submit" class="btn btn-primary"/>
                                保存</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@ include file="./commom/foot.jsp" %>
        <script type="text/javascript">
            $(function () {
                $("user-save-modal").modal("hide");
            })

            function updatepwd(userid, userpassword) {
                $("#userid").val(userid);
                $("#psd").val(userpassword);
            }
        </script>
</body>
</html>
