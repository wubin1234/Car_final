<%--
  Created by IntelliJ IDEA.
  User: wubin
  Date: 2019/1/8
  Time: 17:19
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
    <link rel="stylesheet" type="text/css" href="../../plugins/bootstrap/css/bootstrap.min.css" />
    <!--引入自定义css文件-->
    <link rel="stylesheet" href="../../css/navbar.css" />
    <link rel="stylesheet" href="../../css/one/index.css" />
    <style type="text/css">
        .two{
            position: relative;
        }
        .left{
            float: left;
            width: 30%;
            margin-left: 250px;
            margin-top: 150px;
        }
        .right{
            position: relative;
            float: left;
            left: 100px;
            top: 100px;
        }
    </style>

</head>

<body style="background-color: #F5F5F5;">
<!--响应式导航-->
<div class="container-fluid">
    <div class="row">
        <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example-navbar-collapse">
                        <span class="sr-only">切换导航</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">大乘汽车</a>
                </div>
                <div>
                    <div class="collapse navbar-collapse" id="example-navbar-collapse">
                        <ul class="nav navbar-nav nar navbar-right">
                            <li>
                                <a href="login.jsp">登录注册</a>
                            </li>
                            <li>
                                <a href="${path}/four/Business_cooperation.jsp">商务合作</a>
                            </li>
                            <li>
                                <a href="${path}/two/ppcx/ppcx.jsp">品牌车型</a>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    大乘天地
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="${path}/three/Overview.jsp">大乘概述</a>
                                    </li>
                                    <li>
                                        <a href="${path}/three/Positioning.jsp">品牌定位</a>
                                    </li>
                                    <li>
                                        <a href="${path}/three/Promise.jsp">大乘承诺</a>
                                    </li>

                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    资讯动态
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="${path}/two/zxdt/xwdt.jsp">新闻动态</a>
                                    </li>
                                    <li>
                                        <a href="${path}/two/zxdt/zxdt.jsp">视屏集锦</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    关爱服务
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="${path}/four/Care_service.jsp">关爱服务</a>
                                    </li>
                                    <li>
                                        <a href="${path}/four/New_Energy_services.jsp">新能源服务</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    更多服务
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="yysj.jsp">预约试驾</a>
                                    </li>
                                    <li>
                                        <a href="orange.jsp">橙子俱乐部</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    会员活动
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">最新活动</a>
                                    </li>
                                    <li>
                                        <a href="#">精彩回顾</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</div>
<!--响应式导航结束-->

<!--第一个图片-->
<div class="container-fluid">
    <div class="row">
        <div class="">
            <img src="../../img/one/orange_first.jpg" style="max-width: 100%;"/>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="two">
            <div class="left">
                <h2>全方位服务</h2>
                <span id="">
							橙子俱乐部为年轻人与年轻家庭建立全方位的服务体系，覆盖客户用车全生命周期的数字化平台，
							以客户为中心，提高客户满意度，增强客户互动性，乐享无限精彩。
							橙子俱乐部是一个充满沟通与交流，朝气蓬勃的情感社区，传递动感时尚，科技创新，为客户打造一种年轻、积极向上的生活方式，欢迎您的加入！
						</span>
            </div>
            <div class="right">
                <img src="../../img/one/orange_two.jpg"/>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="" style="position: relative;top: 160px;">
            <img src="../../img/one/orange_three.jpg" style="max-width: 100%;"/>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="submit" style="margin-top: 200px; margin-left: 100px;">
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="firstname" class="col-sm-2 control-label">留言类别：</label>
                    <div class="col-md-2">
                        <div class="dropdown">
                            <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown">咨询
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">咨询</a>
                                </li>
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">投诉</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastname" class="col-sm-2 control-label">基本信息：</label>
                    <div class="col-md-2">
                        <h3>姓名</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入姓名">
                    </div>
                    <div class="col-md-2">
                        <h3>电话</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入电话">
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastname" class="col-sm-2 control-label">留言内容：</label>
                    <div class="col-md-4">
                        <textarea class="form-control" rows="3" placeholder="请输入留言内容"></textarea>
                    </div>
                </div>
                <div class="form-group" style="margin-top: 30px;">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">确认提交</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

</div>
<!--表单结束-->
</body>
<!--
    引入jquery文件
-->
<script src="../../plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--
    引入bootstrap.js
-->
<script type="text/javascript" src="../../plugins/bootstrap/js/bootstrap.js"></script>

</html>

