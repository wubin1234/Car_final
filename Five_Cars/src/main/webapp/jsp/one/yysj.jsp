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
        .background {
            position: absolute;
            top: 400px;
            left: 784px;
            z-index: -2;
        }
    </style>
</head>

<body style="background-color: #F5F5F5;">
<!--响应式导航-->
<%@include file="../common/nar.jsp"%>
<!--响应式导航结束-->

<div class="container-fluid">
    <div class="row">
        <div class="title" style="text-align: center;">
            <h1>预约试驾</h1>
            <h1>Dorcen Test Drive</h1>
        </div>
    </div>

</div>

<!--表单开始-->
<div class="container-fluid">
    <div class="row">
        <div class="submit" style="margin-top: 30px;">
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="firstname" class="col-sm-2 control-label">选择车型:</label>
                    <div class="col-md-2">
                        <div class="dropdown">
                            <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown">G70S
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">G70S</a>
                                </li>
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">SUV</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="dropdown">
                            <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown">豪华型
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">豪华型</a>
                                </li>
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">尊贵型</a>
                                </li>
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">至尊型</a>
                                </li>
                                <li role="presentation">
                                    <a role="menuitem" tabindex="-1" href="#">旗舰型</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastname" class="col-sm-2 control-label">填写信息:</label>
                    <div class="col-md-2">
                        <h3>姓名</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入姓名">
                    </div>
                    <div class="col-md-2">
                        <h3>电话</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入电话">
                    </div>
                    <div class="col-md-2">
                        <h3>时间</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入时间">
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastname" class="col-sm-2 control-label">经销商:</label>
                    <div class="col-md-2">
                        <h3>省份</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入省份">
                    </div>
                    <div class="col-md-2">
                        <h3>城市</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入城市">
                    </div>
                    <div class="col-md-2">
                        <h3>经销商</h3>
                        <input type="text" class="form-control col-md-2" id="lastname" placeholder="请输入经销商">
                    </div>
                </div>
                <div class="form-group" style="margin-top: 30px;">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">立即预约</button>
                    </div>
                </div>
            </form>
            <div class="container-fluid">
                <div class="row">
                    <div class="background">
                        <img src="../../img/one/yysj_first.jpg" />
                    </div>
                </div>
            </div>
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