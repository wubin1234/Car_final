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
<%@include file="../../common/nar.jsp"%>
<!--响应式导航结束-->
<div class="carousel-fluid" style="    color: inherit; background-color: #eee;">
    <div class="row" style="margin-left: 75px">
        <img src="${path}/img/two/1.PNG" class="img-responsive" alt="Responsive image"/>

    </div>
    <div class="jumbotron" style="text-align: center;">
        <h1>新闻动态</h1>
        <h1>News Information</h1>
    </div>
    <div class="row" >
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${path}/img/two/2.jpg"
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
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.min.js" ></script>
</body>
</html>

