<%--
  Created by IntelliJ IDEA.
  User: wubin
  Date: 2019/1/8
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.min.css" />
    <!--引入自定义css文件-->
    <link rel="stylesheet" href="${path}/css/navbar.css" />
    <link rel="stylesheet" href="${path}/css/one/index.css" />

</head>

<body>
<!--响应式导航-->
<%@include file="../common/nar.jsp"%>
<!--响应式导航结束-->

<!--轮播开始-->
<div class="container-fluid">
    <div class="row">
        <div id="myCarousel" class="carousel slide">
            <!-- 轮播（Carousel）指标 -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
            </ol>
            <!-- 轮播（Carousel）项目 -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="${path}/img/one/index_first.jpg" alt="First slide">
                </div>
                <div class="item">
                    <img src="${path}/img/one/index_two.jpg">
                </div>
            </div>
            <!-- 轮播（Carousel）导航 -->
            <a class="carousel-control left" href="#myCarousel" data-slide="prev"> <span _ngcontent-c3="" aria-hidden="true" class="glyphicon glyphicon-chevron-right"></span></a>
            <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
        </div>
    </div>
</div>
<!--轮播结束-->

<!--缩略图开始-->
<div class="container-fluid" style="background-color: #121C25;">
    <div class="row">
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <img src="${path}/img/one/index_three.jpg" alt="通用的占位符缩略图">
                <div class="caption" style="text-align: center;">
                    <h3>橙子俱乐部</h3>
                    <p>
                        <a href="#" class="btn btn-primary" role="button">
                            进入
                        </a>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <img src="${path}/img/one/index_four.jpg" alt="通用的占位符缩略图">
                <div class="caption" style="text-align: center;">
                    <h3>品质大乘</h3>
                    <p>
                        <a href="#" class="btn btn-primary" role="button">
                            进入
                        </a>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <img src="${path}/img/one/index_five.jpg">
                <div class="caption" style="text-align: center;">
                    <h3>大乘商城</h3>
                    <p>
                        <a href="#" class="btn btn-primary" role="button">
                            进入
                        </a>
                    </p>
                </div>
            </div>
        </div>
    </div>
    <!--缩略图结束-->

</div>
</body>
<!--
    引入jquery文件
-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--
    引入bootstrap.js
-->
<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.js"></script>
<script>
    $(function() {
        $('#myCarousel').carousel({
            interval: 1000
        })
    })
</script>

</html>
