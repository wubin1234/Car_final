<%--
  Created by IntelliJ IDEA.
  User: X
  Date: 2019/1/9
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.min.css" />
    <!--引入自定义css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/css/navbar.css"/>
</head>

<body>
<!--响应式导航-->
<%@include file="../common/nar.jsp"%>
<!--响应式导航结束-->
<!--缩略图开始-->
<div class="row">

    <div class="col-sm-12 col-md-12">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/P1.png"
                 alt="通用的占位符缩略图">
        </a>
    </div>

    <div class="col-sm-12 col-md-12">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/P2.png"
                 alt="通用的占位符缩略图">
        </a>
    </div>
</div>


</body>
<!--引入jquery文件-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.js"></script>

</html>