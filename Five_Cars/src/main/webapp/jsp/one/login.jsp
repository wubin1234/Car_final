<%--
  Created by IntelliJ IDEA.
  User: wubin
  Date: 2019/1/8
  Time: 17:18
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
    <link rel="stylesheet" type="text/css" href="../../plugins/bootstrap/css/bootstrap.css" />
    <!--引入自定义css文件-->
    <link rel="stylesheet" href="../../css/navbar.css" />
    <link rel="stylesheet" href="../../css/one/index.css" />
    <style type="text/css">
        body{
            background: url(../../img/one/login_background.jpg) no-repeat;
            height: 100%;
            width: 100%;
            background-size:100% 140% ;

        }
        #login{
            /*设置边框的大小,线条,颜色*/
            border: 1px solid #999;
            /*设置div的宽度*/
            width: 50%;
            /**div居中显示**/
            margin: auto;
            /**margin padding关于css中的盒子模型中的内容**/
            padding: 20px;
            /**距离相邻元素上边的距离是50px**/
            margin-top: 50px;
            /*设置边框为圆角*/
            border-radius: 20px;

            /*设置边框的阴影部分*/
            box-shadow: 2px 2px 4px #000;
        }

        #login_text{
            /*设置字体颜色*/
            color: white;
            /*设置字体阴影*/
            text-shadow: 2px 2px 0px #000;
            /*设置字体的大小*/
            font-size: 30px;
        }
    </style>
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

<!--登录-->
<div class="container-fluid">
    <div class="row">
        <div id="login">
            <form class="form-horizontal" role="form">
                <fieldset>
                    <legend><h3 id="login_text">用户登录入口</h3></legend>
                    <div class="form-group has-feedback">
                        <label for="firstname" class="col-sm-2 control-label">用户名</label>
                        <div class="col-md-5">
                            <input type="text" class="form-control" id="firstname" placeholder="请输入名字">
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <label for="lastname" class="col-sm-2 control-label">密码</label>
                        <div class="col-md-5">
                            <input type="password" class="form-control" id="lastname" placeholder="请输入姓">
                            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <label for="lastname" class="col-sm-2 control-label">手机</label>
                        <div class="col-md-5">
                            <input type="text" class="form-control" id="lastname" placeholder="请输入手机号">
                            <span class="glyphicon glyphicon-phone form-control-feedback"></span>
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <label for="lastname" class="col-sm-2 control-label">住址</label>
                        <div class="col-md-5">
                            <input type="text" class="form-control" id="lastname" placeholder="请输入住址">
                            <span class="glyphicon glyphicon-home form-control-feedback"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox">请记住我 </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group" style="float: left;margin-left: 95px;">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">登录</button>
                        </div>
                    </div>
                    <div class="form-group" style="float: left; margin-left: 15px;">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button class="btn btn-default"><a href="register.jsp">注册</a></button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
<!--登录结束-->

<!--引入jquery文件-->
<script src="../../plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="../../plugins/bootstrap/js/bootstrap.js"></script>
</body>

</html>