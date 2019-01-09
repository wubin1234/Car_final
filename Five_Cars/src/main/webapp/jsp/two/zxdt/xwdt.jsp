<%--
  Created by IntelliJ IDEA.
  User: Shock Wave
  Date: 2019/1/9
  Time: 11:12
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
<div class="carousel-fluid" style="    color: inherit; background-color: #eee;">
    <div class="row">
        <img src="${path}/img/two/1.PNG" class="img-responsive" alt="Responsive image"/>

    </div>
    <div class="jumbotron" style="text-align: center;">
        <h1>新闻动态</h1>
        <h1>News Information</h1>
    </div>
    <div class="row" >
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src=${path}/img/two/2.jpg"
                     alt="通用的占位符缩略图" class="img-circle">
                <div class="caption">
                    <h3>年底压轴！大乘汽车战略车型G60S正式下线</h3>
                    <p>2018年12月29日，江西大乘汽车科技产业园项目正式竣工，首批大乘汽车G60S在众多领导嘉宾以及100多家行业媒体的见证下，正式投产下线。凭借靓丽的外观和越级科技配置，大乘G60S甫一出场即引发强烈关注。贯穿式大屏…</p>
                    <p>
                        <a class="return" href="xw.jsp">了解更多</a>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/3.jpg"
                     alt="通用的占位符缩略图" class="img-circle">
                <div class="caption">
                    <h3>大乘汽车再添羽翼 江西大乘汽车科技产业园正式投产</h3>
                    <p>2018年12月29日，“创新引领兴赣 绿色崛起实干”——江西大乘汽车科技产业园投产暨整车下线仪式于江西抚州正式举办。此次大乘汽车对标国际工业4.0的新工厂总建筑面积约50万㎡，历时13个月建设，是全面覆盖乘用车、商…</p>
                    <p>
                        <a class="return" href="xw.jsp">了解更多</a>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/4.jpg"
                     alt="通用的占位符缩略图" class="img-circle">
                <div class="caption">
                    <h3>中国汽车3.0时代的新机会                                  —世界汽车工程师学会联合会主席赵福全调研大乘汽车一席谈</h3>
                    <p>赵福全调研大乘汽车 谈汽车3.0时代新机会导语：对于自主品牌来说，这是一个最好的时代。中国已经成为世界上最大的汽车市场，而且正处于向“新四化”转型的阶段，众多造车新势力风起云涌，瞄准机会，准备利用新技术弯…</p>
                    <p>
                        <a class="return" href="xw.jsp">了解更多</a>
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/5.jpg"
                     alt="通用的占位符缩略图" class="img-circle">
                <div class="caption">
                    <h3>大乘汽车继续扩大“朋友圈”，战略牵手“头部资源”</h3>
                    <p>2018年12月7日， 大乘汽车正式与盖斯特咨询公司确立战略合作，双方将在企业战略、产品规划、管理咨询等多个方面进行深度合作。进一步优化整合优势资源，拓展大乘汽车在汽车市场的战略新布局，快速推动企业迈向“汽车…</p>
                    <p>
                        <a class="return" href="xw.jsp">了解更多</a>
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

