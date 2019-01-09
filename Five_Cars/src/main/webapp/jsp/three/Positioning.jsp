<%--
  Created by IntelliJ IDEA.
  User: X
  Date: 2019/1/9
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
html>

<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.min.css" />
    <!--引入自定义css文件-->
    <link rel="stylesheet" href="${path}/css/one/index.css" />
</head>

<body>
!--响应式导航-->
<%@include file="../common/nar.jsp"%>
<!--响应式导航结束-->

<!--缩略图开始-->

<div class="row">

    <div class="col-sm-12 col-md-12">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/PI1.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>

    <div class="col-sm-12 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/PI2.png"
                 alt="通用的占位符缩略图">
        </a>
    </div>

    <div class="col-sm-12 col-md-8">
        <a href="#" class="thumbnail">
            <img src=${path}/img/Three/PI5.png"
                 alt="通用的占位符缩略图">
        </a>
    </div>

    <div class="col-sm-12 col-md-4">
        <a href="#" class="thumbnail">
            <img srC="${path}/img/Three/PI6.png"
                 alt="通用的占位符缩略图">
        </a>
    </div>



    <div class="col-sm-12 col-md-8">
        <div class="thumbnail"  >
            <img src="${path}/img/Three/PI4.jpg"
                 alt="通用的占位符缩略图">
            <div class="caption">

                <p style="font-size: 20px;">橙色代表，饱满的生命力，新鲜的活力，进取的动力，是属于年轻人的颜色，也正契合大乘“年轻人专属”的品牌定位。</p>
            </div>
        </div>
    </div>
    <div class="row">


        <div class="col-sm-12 col-md-4">
            <a href="#" class="thumbnail">
                <img srC="${path}/img/Three/PI7.jpg"
                     alt="通用的占位符缩略图">
            </a>
        </div>

        <div class="col-sm-12 col-md-8">
            <div class="thumbnail"  >
                <img src="${path}/img/Three/PI8.jpg"
                     alt="通用的占位符缩略图">
                <div class="caption">
                    <h3 style="font-size: 50px;">品牌核心消费人群</h3>
                    <p style="font-size: 20px;"> 大乘品牌聚焦年轻人和年轻家庭他们平时关注科技喜欢尝试新事物，他们努力工作同时也不忘享受生活，他们活力亲和的但也追求自己独立的个性</p>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-12 col-md-12">
        <div class="thumbnail"  >
            <img src="${path}/img/Three/PI3.jpg"
                 alt="通用的占位符缩略图">
            <div class="caption">
                <h3 style="font-size: 50px;text-align: center;">大乘品牌价值主张</h3>
                <p style="font-size: 20px;text-align: center;">怀进取之心，与年轻同行</p>
            </div>
        </div>
    </div>

    <div class="col-sm-12 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/PI9.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>

    <div class="col-sm-12 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/PI10.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>

    <div class="col-sm-12 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/PI11.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>

</div>
<!--缩略图结束-->


</body>
<!--引入jquery文件-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.js"></script>

</html>
