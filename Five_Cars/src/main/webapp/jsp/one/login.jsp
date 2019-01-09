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
            background-size:100% 170% ;

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
<%@include file="../common/nar.jsp"%>
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
                            <a href="register.jsp" class="btn btn-default" role="button">注册</a>
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