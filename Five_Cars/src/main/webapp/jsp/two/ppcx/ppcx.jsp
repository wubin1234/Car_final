<%--
  Created by IntelliJ IDEA.
  User: Shock Wave
  Date: 2019/1/9
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>品牌车型-大乘汽车</title>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/css/navbar.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/css/two/two.css"/>
    <style type="text/css">
        #model .model-ban {
            position: relative;
            height: 633px;
            background: no-repeat center/cover;
        }
        /* Custom Styles */
        ul.nav-tabs{
            width: 140px;
            margin-top: 20px;
            border-radius: 4px;
            /*border: 1px solid #ddd;*/
            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
        }
        ul.nav-tabs li{
            margin: 0;
            border-top: 1px solid #ddd;
        }
        ul.nav-tabs li:first-child{
            border-top: none;
        }
        ul.nav-tabs li a{
            margin: 0;
            padding: 8px 16px;
            border-radius: 0;
        }
        ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover {
            color: #fff;
            background: black;
            border: 1px solid white;
        }
        ul.nav-tabs li:first-child a{
            border-radius: 4px 4px 0 0;
        }
        ul.nav-tabs li:last-child a{
            border-radius: 0 0 4px 4px;
        }
        ul.nav-tabs.affix{
            top: 30px; /* Set the top position of pinned element */
        }
        a{
            color: white;
        }

    </style>
</head>
<body data-spy="scroll" data-target="#myScrollspy" style="background-color: black;">
<!--响应式导航-->
<%@include file="../../common/nar.jsp"%>
<!--响应式导航结束-->

<div class="row" style="margin-left: 75px;">
    <img src="${path}/img/two/30.PNG" class="img-responsive" alt="Responsive image"/>
</div>
<div class="container">
    <div class="jumbotron" style="    background-color:#000000;">
        <h1 style="color: white;text-align: center;">概览</h1>
    </div>
    <div class="row">
        <div class="col-xs-2" id="myScrollspy">
            <ul class="nav nav-tabs nav-stacked" data-spy="affix" data-offset-top="125">
                <li class="active"><a href="#section-1">超高颜值</a></li>
                <li><a href="#section-2">超高智商</a></li>
                <li><a href="#section-3">超大尺寸</a></li>
                <li><a href="#section-4">超全配置</a></li>
                <li><a href="#section-5">超强安全</a></li>
            </ul>
        </div>
        <div class="col-xs-10">
            <img class="img" id="section-1" src="${path}/img/two/21.PNG"/>
            <img class="img" id="section-2" src="${path}/img/two/22.PNG"/>
            <img class="img" id="section-3" src="${path}/img/two/23.PNG"/>
            <img class="img" id="section-4" src="${path}/img/two/24.PNG"/>
            <img class="img" id="section-5" src="${path}/img/two/25.PNG"/>
        </div>
    </div>
</div>
<!--引入jquery文件-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.min.js" ></script>
</body>
</html>

