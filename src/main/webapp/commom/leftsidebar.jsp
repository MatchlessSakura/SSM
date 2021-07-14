<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:if test="${sessionScope.user.usercon==1}">
    <div class="panel-group col-sm-2" id="lvxs_sidebar_left" role="tablist" aria-multiselectable="true">
        <ul class="nav nav-pills nav-stacked user_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_user">
                    <span class="glyphicon glyphicon-user" aria-hidden="true"> 系统管理</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_user">
                    <li><a href="/lvxs/user/selectall" class="user_info">用户信息</a></li>
                    <li><a href="#" role="button" class="user_add_btn" data-toggle="modal"
                           data-target="#user-add-modal">用户添加</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav nav-pills nav-stacked com_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_com">
                    <span class="glyphicon glyphicon-home" aria-hidden="true"> 基础信息管理</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_com">
                    <li><a href="/lvxs/company/selectall">旅行社信息</a></li>
                    <li><a href="/lvxs/line/selectall">线路信息管理</a></li>
                    <li><a href="#" role="button" data-toggle="modal"
                           data-target="#line-add-modal">线路添加</a></li>
                    <li><a href="/lvxs/staff/selectall">员工信息管理</a></li>
                    <li><a href="#" role="button" data-toggle="modal"
                           data-target="#staff-add-modal">员工添加</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav nav-pills nav-stacked work_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_work">
                    <span class="glyphicon glyphicon-phone-alt" aria-hidden="true"> 业务管理</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_work">
                    <li><a href="/lvxs/work/selectall">业务信息</a></li>
                    <li>
                        <a href="/lvxs/work/selectwork">业务登记</a>
                    </li>
                </ul>
            </li>
        </ul>
        <ul class="nav nav-pills nav-stacked search_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_search">
                    <span class="glyphicon glyphicon-cloud" aria-hidden="true"> 信息查询</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_search">
                    <li><a href="/lvxs/company/selectall" class="lvxs_info">旅行社信息查询</a></li>
                    <li><a href="/lvxs/search/linesearch.jsp" class="lvxs_info">线路信息查询</a></li>
                    <li><a href="/lvxs/search/staffsearch.jsp" class="lvxs_info">员工信息查询</a></li>
                    <li><a href="/lvxs/search/worksearch.jsp" class="lvxs_info">业务查询</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav nav-pills nav-stacked info_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_info">
                    <span class="glyphicon glyphicon-tasks" aria-hidden="true"> 数据统计</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_info">
                    <li><a href="/lvxs/work/echart1">登陆业务汇总表</a></li>
                    <li><a href="/lvxs/work/echart2">确认出游汇总表</a></li>
                    <li><a href="/lvxs/work/echart3">业务结算汇总表</a></li>
                    <li><a href="/lvxs/work/echart4">周期结算汇总表</a></li>
                    <li><a href="${pageContext.request.contextPath}/e-chart/totel.jsp">数据统计</a></li>
                </ul>
            </li>
        </ul>

            <%--    用户添加--%>
        <div class="modal fade" id="user-add-modal" tabindex="-1">
                <%-- -1 禁止键盘tab对其导航--%>
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">添加用户</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/lvxs/user/adduser" method="post">
                            用户名：<input type="text" name="username"/><br/>
                            密 码：<input type="text" name="userpassword"/><br/>
                            控制权：
                            <select name="usercon">
                                <option>未选择</option>
                                <option>1</option>
                                <option>2</option>
                            </select><br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
            <%--    线路添加--%>
        <div class="modal fade" id="line-add-modal" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">添加线路</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/lvxs/line/addline" method="post">
                            出发地：<input type="text" name="lineap"/><br/>
                            目的地：<input type="text" name="linebp"/><br/>
                            时间段：<input type="text" name="lineday" style="width:50px"/>天<br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
            <%--    员工添加--%>
        <div class="modal fade" id="staff-add-modal" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">添加员工</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/lvxs/staff/addstaff" method="post">
                            员工姓名：<input type="text" name="staffname"/><br/>
                            员工性别：
                            <select name="staffsex">
                                <option>未选择</option>
                                <option>男</option>
                                <option>女</option>
                            </select><br/>
                            员工年龄：<input type="text" name="staffage"/><br/>
                            员工电话：<input type="text" name="staffpho" placeholder="11位电话"/><br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</c:if>
<c:if test="${sessionScope.user.usercon==2}">
    <div class="panel-group col-sm-2" id="lvxs_sidebar_left" role="tablist" aria-multiselectable="true">
        <ul class="nav nav-pills nav-stacked com_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_com">
                    <span class="glyphicon glyphicon-home" aria-hidden="true"> 基础信息管理</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_com1">
                    <li><a href="/lvxs/company/selectall">旅行社信息</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav nav-pills nav-stacked work_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_work">
                    <span class="glyphicon glyphicon-phone-alt" aria-hidden="true"> 业务管理</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_work1">
                    <li><a href="/lvxs/work/selectall">业务信息</a></li>
                    <li>
                        <a href="/lvxs/work/selectwork">业务登记</a>
                    </li>
                </ul>
            </li>
        </ul>
        <ul class="nav nav-pills nav-stacked search_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_search">
                    <span class="glyphicon glyphicon-cloud" aria-hidden="true"> 信息查询</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_search1">
                    <li><a href="/lvxs/company/selectall" class="lvxs_info">旅行社信息查询</a></li>
                    <li><a href="/lvxs/search/linesearch.jsp" class="lvxs_info">线路信息查询</a></li>
                    <li><a href="/lvxs/search/staffsearch.jsp" class="lvxs_info">员工信息查询</a></li>
                    <li><a href="/lvxs/search/worksearch.jsp" class="lvxs_info">业务查询</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav nav-pills nav-stacked info_sidebar">
            <li role="presentation" class="active">
                <a href="#" data-toggle="collapse" data-target="#collapse_info">
                    <span class="glyphicon glyphicon-tasks" aria-hidden="true"> 数据统计</span>
                </a>
                <ul class="nav nav-pills nav-stacked" id="collapse_info1">
                    <li><a href="/lvxs/work/echart1">登陆业务汇总表</a></li>
                    <li><a href="/lvxs/work/echart2">确认出游汇总表</a></li>
                    <li><a href="/lvxs/work/echart3">业务结算汇总表</a></li>
                    <li><a href="/lvxs/work/echart4">周期结算汇总表</a></li>
                    <li><a href="${pageContext.request.contextPath}/e-chart/totel.jsp">数据统计</a></li>
                </ul>
            </li>
        </ul>
            <%--    用户添加--%>
        <div class="modal fade" id="user-add-modal" tabindex="-1">
                <%-- -1 禁止键盘tab对其导航--%>
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">添加用户</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/lvxs/user/adduser" method="post">
                            用户名：<input type="text" name="username"/><br/>
                            密 码：<input type="text" name="userpassword"/><br/>
                            控制权：
                            <select name="usercon">
                                <option>未选择</option>
                                <option>1</option>
                                <option>2</option>
                            </select><br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
            <%--    线路添加--%>
        <div class="modal fade" id="line-add-modal" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">添加线路</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/lvxs/line/addline" method="post">
                            出发地：<input type="text" name="lineap"/><br/>
                            目的地：<input type="text" name="linebp"/><br/>
                            时间段：<input type="text" name="lineday" style="width:50px"/>天<br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
            <%--    员工添加--%>
        <div class="modal fade" id="staff-add-modal" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">添加员工</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/lvxs/staff/addstaff" method="post">
                            员工姓名：<input type="text" name="staffname"/><br/>
                            员工性别：
                            <select name="staffsex">
                                <option>未选择</option>
                                <option>男</option>
                                <option>女</option>
                            </select><br/>
                            员工年龄：<input type="text" name="staffage"/><br/>
                            员工电话：<input type="text" name="staffpho" placeholder="11位电话"/><br/>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</c:if>
</body>
</html>
