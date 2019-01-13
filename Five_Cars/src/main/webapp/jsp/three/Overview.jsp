<%--
  Created by IntelliJ IDEA.
  User: X
  Date: 2019/1/9
  Time: 11:23
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
    <link rel="stylesheet" href="${path}/css/navbar.css" />
    <style >
        #outer_OV{

            height: 550px;
            position: relative;

        }
        #inner_OV{
            margin: auto;
            width: 500px;
            height: 100px;
            color: white;
            text-align: center;
            font-size: 50px;

            position: absolute;
            left: 40%;
            top:30%;
        }
        #outer1{
            width: 100%;
            height: 150px;
            background-color: white;
        }

        .exp1{font-size: 50px;font-weight: bold;}
        .exp2{height: 72px;width: 417px;}


    </style>

</head>

<body>

<!--响应式导航-->
<%@include file="../common/nar.jsp"%>
<!--响应式导航结束-->

<!--缩略图开始-->
<div class="row">
    <div class="col-sm-12 col-md-12">
        <div  class="thumbnail" >
            <img src="${path}/img/Three/OV1.jpg"
                 alt="通用的占位符缩略图">
            <div class="caption">
                <h3 class="exp1"  style="text-align: center";>企业理念</h3>
                    <div class="media-body">
                     <p style="text-align: center;font-size: 20px">我们的使命造懂年轻人的车，成为中国年轻人的专属品牌。</p>
                    </div>
            </div>
        </div>
    </div>

    <div class="col-sm-8 col-md-12">
        <div class="thumbnail"  >
            <img src="${path}/img/Three/OV2.jpg"
                 alt="通用的占位符缩略图">
            <div class="caption">
                <h3 class="exp1" style="text-align: center;">创建历史</h3>
                <div class="media-body">
                        <p style="text-align: center">10年思索<br>创始人吴潇本着以客户体验为核心的造车理念，结合扎实的造车工匠底蕴，应用新一代车载智能互联技术，准备为年轻一代造出品质更高的车。</>
                    <p style="text-align: center">3年准备<br>大乘汽车自2015年组建开始，三年内完成团队组建、市场调研、车联网技术和车型开发等核心工作</p>
                </div>
            </div>
        </div>
    </div>

</div>


<div class="col-sm-8 col-md-12">
    <div class="thumbnail"  >
        <img src="${path}/img/Three/OV5.jpg"
             alt="通用的占位符缩略图">
        <div class="caption">
            <h3 class="exp1" style="text-align: left;">人才团队</h3>
            <div class="#">
                <img src="${path}/img/Three/OV11.png">
            </div>
            <p >大乘是传统与现代、传承与创新的集大成者，<br> 为了造年轻人的精品车，我们融合了传统汽车与互联网人才，也汇聚了国际化的专家团队。</p>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img srC="${path}/img/Three/0V6.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>
    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/OV7.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>

    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/OV7.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>
    <div class="col-sm-12 col-md-12">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/OV9.jpg"
                 alt="通用的占位符缩略图">
        </a>
    </div>
    <div class="col-sm-12 col-md-12">
        <a href="#" class="thumbnail">
            <img src="${path}/img/Three/OV10.jpg"
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
