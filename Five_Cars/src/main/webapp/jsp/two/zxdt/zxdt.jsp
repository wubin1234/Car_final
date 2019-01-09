<%--
  Created by IntelliJ IDEA.
  User: Shock Wave
  Date: 2019/1/9
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>资讯动态-大乘汽车</title>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/css/navbar.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/css/two/two.css"/>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
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
                    <a class="navbar-brand" href="${path}/one/index.html">大乘汽车</a>
                </div>
                <div>
                    <div class="collapse navbar-collapse" id="example-navbar-collapse">
                        <ul class="nav navbar-nav nar navbar-right">
                            <li>
                                <a href="${path}/one/login.jsp">登录注册</a>
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
                                        <a href="${path}/one/yysj.jsp">预约试驾</a>
                                    </li>
                                    <li>
                                        <a href="${path}/one/orange.jsp">橙子俱乐部</a>
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
<div class="carousel-fluid">
    <div class="row">
        <div class="ad" style="height: auto;position: relative; overflow: hidden;">
            <video autoplay="true" class="pcitem" src="${path}/img/two/11.mp4" style="width: 100%;    display: inline-block;
    vertical-align: baseline;"></video>
            <div class="bgimg mobitem" style="background-image: url(${path}/img/two/6.jpg)"></div>

        </div>
    </div>
    <div class="jumbotron" style="text-align: center;">
        <h1>视频集锦</h1>
        <h1>Video collection</h1>
    </div>

    <div class="row">
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/31.png"
                     alt="通用的占位符缩略图">
                <div class="caption">
                    <h3>大乘G70S燃情快感，一触即发</h3>
                    <p>
                        <!-- 按钮触发模态框 -->
                        <button class="return" data-toggle="modal" data-target="#myModal">播放</button>
                        <!-- 模态框（Modal） -->
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content" >
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title" id="myModalLabel">大乘G70S燃情快感，一触即发</h4>
                                </div>
                                <div class="modal-body"> <video controls class="pcitem" src="${path}/img/two/12.mp4" style="width: 100%;    display: inline-block;
    vertical-align: baseline;"></video></div>

                            </div><!-- /.modal-content -->
                        </div><!-- /.modal -->
                    </div>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/32.jpg"
                     alt="通用的占位符缩略图">
                <div class="caption">
                    <h3>承载青春梦想</h3>
                    <p>
                        <!-- 按钮触发模态框 -->
                        <button class="return" data-toggle="modal" data-target="#myModa2">播放</button>
                        <!-- 模态框（Modal） -->
                    <div class="modal fade" id="myModa2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title" id="myModalLabel">承载青春梦想</h4>
                                </div>
                                <div class="modal-body"> <video controls class="pcitem" src="${path}/img/two/13.mp4" style="width: 100%;    display: inline-block;
    vertical-align: baseline;"></video></div>

                            </div><!-- /.modal-content -->
                        </div><!-- /.modal -->
                    </div>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/33.jpg"
                     alt="通用的占位符缩略图">
                <div class="caption">
                    <h3>动感科技 智能设计</h3>
                    <p>
                        <!-- 按钮触发模态框 -->
                        <button class="return" data-toggle="modal" data-target="#myModa3">播放</button>
                        <!-- 模态框（Modal） -->
                    <div class="modal fade" id="myModa3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title" id="myModalLabel">动感科技 智能设计</h4>
                                </div>
                                <div class="modal-body"> <video controls class="pcitem" src="${path}/img/two/14.mp4" style="width: 100%;    display: inline-block;
    vertical-align: baseline;"></video></div>

                            </div><!-- /.modal-content -->
                        </div><!-- /.modal -->
                    </div>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/34.jpg"
                     alt="通用的占位符缩略图">
                <div class="caption">
                    <h3>智能互联+传统车企的工匠精神</h3>
                    <p>
                        <!-- 按钮触发模态框 -->
                        <button class="return" data-toggle="modal" data-target="#myModa4">播放</button>
                        <!-- 模态框（Modal） -->
                    <div class="modal fade" id="myModa4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title" id="myModalLabel">大乘G70S燃情快感，一触即发</h4>
                                </div>
                                <div class="modal-body"> <video controls class="pcitem" src="${path}/img/two/15.mp4" style="width: 100%;    display: inline-block;
    vertical-align: baseline;"></video></div>

                            </div><!-- /.modal-content -->
                        </div><!-- /.modal -->
                    </div>
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>

<!--引入jquery文件-->
<script src=${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.min.js" ></script>
</body>
</html>

