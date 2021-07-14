<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>旅行社管理系统</title>
</head>
<body>
<div class="lvxs_container">
    <%@ include file="./commom/head.jsp" %>
    <div class="lvxs_body" style="position:relative; top:-15px;">
        <%@ include file="./commom/leftsidebar.jsp" %>
        <div class="lvxs_main_ad col-sm-10">
            <div class="panel panel-success">
                <div class="panel-heading">
                    <h3 style="text-align: center;">欢迎进入旅行社管理系统！</h3>
                </div>
                <div class="panel-body" style="position:relative; top:10px;">
                    <div id="lvxs_carousel_1" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#lvxs_carousel_1" data-slide-to="0" class="active"></li>
                            <li data-target="#lvxs_carousel_1" data-slide-to="1"></li>
                            <li data-target="#lvxs_carousel_1" data-slide-to="2"></li>
                        </ol>

                        <div class="carousel-inner" role="listbox">
                            <div class="item active">
                                <img class="img-responsive center-block" src="./img/11.jpg" alt="company1">
                                <div class="carousel-caption">
                                </div>
                            </div>
                            <div class="item">
                                <img class="img-responsive center-block" src="./img/22.jpg" alt="company2">
                                <div class="carousel-caption">
                                </div>
                            </div>
                            <div class="item">
                                <img class="img-responsive center-block" src="./img/33.jpg" alt="company3">
                                <div class="carousel-caption">
                                </div>
                            </div>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#lvxs_carousel_1" role="button" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#lvxs_carousel_1" role="button" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <!-- 尾部 -->
    <%@ include file="./commom/foot.jsp" %>
</div>

</body>
</html>

