<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<!--引入bootstrap.min.css文件-->
		<link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${path}/css/navbar.css"/>
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
							<a class="navbar-brand" href="${path}/jsp/one/index.jsp">大乘汽车</a>
						</div>
						<div>
							<div class="collapse navbar-collapse" id="example-navbar-collapse">
								<ul class="nav navbar-nav nar navbar-right">
									<li>
										<a href="${path}/jsp/one/login.jsp">登录注册</a>
									</li>
									<li>
										<a href="Business_cooperation.jsp">商务合作</a>
									</li>
									<li>
										<a href="${path}/jsp/two/ppcx/ppcx.jsp">品牌车型</a>
									</li>
									<li class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown">
											大乘天地
											<b class="caret"></b>
										</a>
										<ul class="dropdown-menu">
											<li>
												<a href="${path}/jsp/three/Overview.jsp">大乘概述</a>
											</li>
											<li>
												<a href="${path}/jsp/three/Positioning.jsp">品牌定位</a>
											</li>
											<li>
												<a href="${path}/jsp/three/Promise.jsp">大乘承诺</a>
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
												<a href="${path}/jsp/two/zxdt/xwdt.jsp">新闻动态</a>
											</li>
											<li>
												<a href="${path}/jsp/two/zxdt/zxdt.jsp">视屏集锦</a>
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
												<a href="Care_service.jsp">关爱服务</a>
											</li>
											<li>
												<a href="New_Energy_services.jsp">新能源服务</a>
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
												<a href="${path}/jsp/one/yysj.jsp">预约试驾</a>
											</li>
											<li>
												<a href="${path}/jsp/one/orange.jsp">橙子俱乐部</a>
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
		<!--关爱服务开始-->
		<div class="container-fluid">
			<div class="row">
				<div id="firstname" style="background-image: url(../../img/four/service.jpg);">
					
				
			<div class="text-center" style="font-size: 50px;font-weight: bold;line-height: 200px;">
						<p>关爱服务</p>
						<p>Care Servise</p>
					</div>	
				</div>
				<img src="${path}/img/four/service-logo.png"/>
				<div class="text-center" style="font-size: 20px;">
						江西大乘汽车有限公司金坛分公司（以下简称大乘汽车金坛分公司）依据《消费者权益保护法》、
						《产品质量法》缺陷汽车产品召回管理条例》、《家用汽车产品修理、更换、退货责任规定》
						等相关法律法规的要求，贯彻“一切以用户为核心”的服务理念，切实保障消费者的合法权益，
						本公司郑重向大乘汽车用户作出八项维修服务承诺：
					</div>
					<ul class="list-group" style=" border: 2px solid #ddd;">
						
							
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									<font color="orange">01</font>
									.24小时服务热线，全国免费服务电话：<font color="orange">400-880-6789</font>
						
							</li>
							
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									<font color="orange">02</font>
									.<font color="orange">主动电访</font>与预约，电访关怀与预约机制
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									
									<font color="orange">03</font>
									.<font color="orange">透明标价与收费</font>，配件价格与维修服务项目公示
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									<font color="orange">04</font>
									.提供原厂零部件<font color="orange">，维护品牌，打击伪劣</font>
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									<font color="orange">05</font>
									.进厂<font color="orange">一次修好</font>，专业技术与品质保证
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									<font color="orange">06</font>
									.保证<font color="orange">准时交车</font>，服务流动主动掌控与畅通
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									<font color="orange">07</font>
									.道路救援服务，服务延伸，<font color="orange">全程呵护</font>
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div class="text-center" style="font-size: 30px ;font-weight: bold;">
									<font color="orange">08</font>
									.服务追踪回访，维修服务跟踪与<font color="orange">预防再发</font>
							</li>
						
							
						
					</ul>
			</div>
			
		</div>
		<!--关爱服务结束-->
		
		<!--引入jquery文件-->
		<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
		<!--引入bootstrap.js-->
		<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.js" ></script>
	</body>
</html>
