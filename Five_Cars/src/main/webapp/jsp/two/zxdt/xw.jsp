<%--
  Created by IntelliJ IDEA.
  User: Shock Wave
  Date: 2019/1/9
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>资讯</title>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/css/two/two.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/css/navbar.css"/>
    <style>
        /* Custom Styles */
        ul.nav-tabs{
            width: 140px;
            margin-top: 20px;
            border-radius: 4px;
            border: 1px solid #ddd;
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
        ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
            color: #fff;
            background: #0088cc;
            border: 1px solid #0088cc;
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
    </style>


</head>
<body data-spy="scroll" data-target="#myScrollspy">
<!--响应式导航-->
<%@include file="../../common/nar.jsp"%>
<!--响应式导航结束-->
<div class="container">
    <div class="jumbotron" style="text-align: center">
        <h2>年底压轴！大乘汽车战略车型G60S正式下线</h2>
        <h5>2019-01-02</h5>
        <p>
            <a class="return" href="xwdt.jsp">返回列表</a>
        </p>
    </div>
    <div class="row" style="background-color: #eee">
        <div class="col-xs-3" id="myScrollspy">
            <ul class="nav nav-tabs nav-stacked" data-spy="affix" data-offset-top="125">
                <li ><a href="#section-1">科技范儿十足</a></li>
                <li><a href="#section-2">四大工艺领先</a></li>
                <li><a href="#section-3">卓越至臻品质</a></li>
            </ul>
        </div>
        <div class="col-xs-9">
            <h2 id="section-1" style="text-align: center">贯穿式大屏吸睛 科技范儿十足</h2>
            <p>    2018年12月29日，江西大乘汽车科技产业园项目正式竣工，首批大乘汽车G60S在众多领导嘉宾以及100多家行业媒体的见证下，正式投产下线。凭借靓丽的外观和越级科技配置，大乘G60S甫一出场即引发强烈关注。</p>
            <img class="img" src="${path}/img/two/41.jpg"/>
            <p>    此次下线的G60S定位于紧凑型SUV，是大乘汽车基于全面的市场调研分析，根据最新的汽车发展潮流，面向移动智能时代的年轻消费者推出的战略产品。G60S的外观设计运用了前卫科技的星际概念，搭载了豪华品牌上才得以见到的贯穿式大屏和一系列前沿的智能科技配置，相信上市后将成为代表紧凑型SUV前沿科技的车型。</p>
            <img class="img" src="${path}/img/two/42.jpg"/>
            <p>    大乘汽车G60S外观整体大气简洁，线条硬朗，前脸采用较为夸张的进气格栅，使新车车头更具辨识度，未来感十足。侧面腰线采取了由前大灯延伸至后尾灯组的贯穿式设计，更添时尚动感。最引人瞩目的仪表台和中控台采用了贯穿式设计，搭配多色氛围灯，使得车内科技感十足，更加炫酷。</p>
            <img class="img" src="${path}/img/two/43.jpg"/>
            <p>    除了远程控制、手机无线充电等一系列智能科技配置，G60S将搭载大乘汽车自主联合研发的新一代的智能互联系统，具有更强的语言识别度和更丰富的信息娱乐功能。</p>

            <hr>
            <h2 id="section-2" style="text-align: center">智能制造新标准 四大工艺领先</h2>
            <p>    同期竣工的江西大乘汽车科技产业园，是大乘汽车对标国际工业4.0先进标准，融入信息化、智能化、自动化等众多先进技术，集研发、生产、销售为一体的复合型、高科技产业园区。对提升抚州乃至江西汽车制造水平、关键零部件生产研发能力以及升级生产工艺、质量，实现产业升级都具有重要作用。</p>
            <img class="img" src="${path}/img/two/44.jpg"/>
            <p>    产业园的冲压、车身、涂装和总装四大工厂，采用业内领先的ABB自动化集成系统、智能物联网系统、射频技术等国际先进的自动化制造装备，实现高度自动化、柔性化、智能化生产。</p>
            <img class="img" src="${path}/img/two/45.jpg"/>
            <p>    作为该产业园的首款量产乘用车，大乘汽车G60S的涂装工艺采用国际领先的射频技术、高泳透力电泳等多种先进工艺，100%采用机器人自动喷涂。为保证车身的刚性要求，焊装车间采用先进的焊装工艺，生产线全部采用KUKA智能机器人，整线自动化率接近95%。同时，装配车间采用业内领先智能物联网系统，建立了一整套双向质量追溯体系，极大地提高量产车型的质量可控性和可靠性。</p>

            <hr>
            <h2 id="section-3" style="text-align: center">严苛检测高标准 卓越至臻品质</h2>
            <p>    得益于大乘汽车在制造中的严苛检验标准，大乘汽车G60S目前已顺利完成了包括高温测试、高寒测试以及高原环境适应性试验，共计完成20大类高原标定测试，百余项整车合格，路试总里程累计长达180万公里。</p>
            <img class="img" src="${path}/img/two/46.jpg"/>
            <p>    即便在缺氧的高海拔地区，大乘汽车G60S的发动机也能适应气压和氧气浓度变化，保持涡轮转速正常稳定，维持高扭矩输出，其操控可靠性、工况适应性、零部件耐久性和发动机稳定性，在多种极限环境下均得到了有效验证。</p>
            <img class="img" src="${path}/img/two/47.jpg"/>
            <p>    提供优质的产品和服务是持续提升大乘汽车市场影响力的关键。作为大乘汽车2019年重量级的战略产品，本次在大乘汽车江西科技产业园正式下线的大乘汽车G60S凭借高颜值的外观和卓越的品质获得现场一致好评和强烈关注。据悉，G60S或将于明年第一季度上市，该款车型能否进一步挖掘市场潜力，成为2019年的销量黑马？让我们拭目以待！</p>
            <hr>
            <p>
                <a class="return" href="xwdt.jsp">返回列表</a>
            </p>
        </div>
    </div>
</div>

<!--引入jquery文件-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.min.js" ></script>
</body>
</html>

