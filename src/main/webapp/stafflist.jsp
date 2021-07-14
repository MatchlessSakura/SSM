<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>旅行社管理系统</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
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
                        <li><a href="/lvxs/staff/selectall">员工信息管理</a></li>
                        <li class="active">员工添加</li>
                    </ol>
                </div>
            </div>
            <table class="table table-bordered table-hover">
                <thead>
                <th>员工id</th>
                <th>员工姓名</th>
                <th>员工性别</th>
                <th>员工年龄</th>
                <th>员工电话</th>
                <c:if test="${sessionScope.user.usercon==1}">
                    <th>操作</th>
                </c:if>
                </thead>
                <tbody>
                <c:forEach items="${staffinfo.list}" var="staff">
                    <tr>
                        <td>${staff.staffid}</td>
                        <td>${staff.staffname}</td>
                        <td>${staff.staffsex}</td>
                        <td>${staff.staffage}</td>
                        <td>${staff.staffpho}</td>
                        <c:if test="${sessionScope.user.usercon==1}">
                        <td>
                               <a>
                                   <input type="button" data-toggle="modal"
                                          data-target="#staff-save-modal"
                                          onclick="updatestaff(${staff.staffid},'${staff.staffname}','${staff.staffsex}',${staff.staffage},${staff.staffpho})"
                                          value="修改">
                                   <a href="${pageContext.request.contextPath}/staff/deletestaff/${staff.staffid}"><input
                                           type="button" value="删除员工"></a>
                               </a>
                        </td>
                        </c:if>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div>
                <a href="${pageContext.request.contextPath}/staff/selectall?pageNo=1">首页</a>
                <a href="${pageContext.request.contextPath}/staff/selectall?pageNo=${requestScope.staffinfo.prePage}">上一页</a>
                <a href="${pageContext.request.contextPath}/staff/selectall?pageNo=${requestScope.staffinfo.nextPage}">下一页</a>
                <a href="${pageContext.request.contextPath}/staff/selectall?pageNo=${requestScope.staffinfo.pages}">末页</a>
            </div>
        </div>
        <div class="modal fade" id="staff-save-modal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">修改员工信息</h4>
                    </div>
                    <div class="modal-body">
                        <form action="${pageContext.request.contextPath}/staff/upstaff" method="post">
                            <input type="hidden" id="sid" name="staffid" value="">
                            员工姓名：<input type="text" id="sname" name="staffname" value=""/><br/>
                            员工性别：
                            <select id="ssex" name="staffsex">
                                <option>男</option>
                                <option>女</option>
                            </select><br/>
                            员工年龄：<input type="text" id="sage" name="staffage" value=""/><br/>
                            员工电话：<input type="text" id="spho" name="staffpho" placeholder="11位电话" value=""/><br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <%@ include file="./commom/foot.jsp" %>
        <script>
            $(function () {
                $("staff-save-modal").modal("hide");
            });

            function updatestaff(staffid, staffname, staffsex, staffage, staffpho) {
                $("#sid").val(staffid);
                $("#sname").val(staffname);
                $("#ssex").val(staffsex);
                $("#sage").val(staffage);
                $("#spho").val(staffpho);
            }
        </script>
</body>
</html>
