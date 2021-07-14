<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>登录</title>
</head>
<style>
    label { float: left; width: 10em; margin-right: 1em; text-align: right; }
    .body {
        position:absolute;
        left:30%;
        top:30%;
    }
    .button{
        font-size: 15px;
        width: 100px;
        text-align: center;
        margin-left: 50%;
    }
    /*.div-all{width:350px;margin-top:5px;height:150px; border:1px solid #92B0DD;}*/
</style>
<body background="./img/block.jpeg"
      style=" background-repeat:no-repeat;background-size:100% 100%;background-attachment:fixed;">
<form method="post" action="${pageContext.request.contextPath}/user/login">
    <div class="body">
        <div class="div-all">
            <label>用户名：</label><input type="text" name="username" class="form-control uname"/><br/><br/>
            <label>密 码：</label><input type="password" name="userpassword" class="form-control pword m-b"><br/><br/>
            <input class="btn button" type="submit" value="登录"/>
        </div>
    </div>
</form>
</body>
</html>
