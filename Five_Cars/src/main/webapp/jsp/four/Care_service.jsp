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
		<link rel="stylesheet" type="text/css" href="${path}/css/four/Care_service.css"/>
	</head>
	<body>
		<!--响应式导航-->
		<%@include file="../common/nar.jsp"%>
		<!--响应式导航结束-->
		<!--关爱服务开始-->
		<div class="container-fluid">
			<div class="row">
				<div id="firstname" style="background-image: url(../../img/four/service.jpg);">
					
				
			<div class="text-center"  style="font-size: 50px;font-weight: bold;line-height: 200px;">
						<p>关爱服务</p>
						<p>Care Servise</p>
					</div>	
				</div>
				<div id="CareService" style="background-image: url(${path}/img/four/Setting.png)">
				<img src="${path}/img/four/service-logo.png" />
				<div class="text" style="font-size: 20px;">
						江西大乘汽车有限公司金坛分公司（以下简称大乘汽车金坛分公司）依据《消费者权益保护法》、
						《产品质量法》缺陷汽车产品召回管理条例》、《家用汽车产品修理、更换、退货责任规定》
					等相关法律法规的要求，贯彻“<font color="black" style="font-weight: bold">一切以用户为核心</font>”的服务理念，切实保障消费者的合法权益，
						本公司郑重向大乘汽车用户作出八项维修服务承诺：
					</div>
					<ul class="list-group" style=" border: 2px solid #ddd;">
						
							
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                
								<div id="text1" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/phone.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>


									<font color="orange">01</font>
									.24小时服务热线，全国免费服务电话：<font color="orange">400-880-6789</font>
						
							</li>
							
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div id="text2" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/time.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>
									<font color="orange">02</font>
									.<font color="orange">主动电访</font>与预约，电访关怀与预约机制
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                
								<div id="text3" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/RMB.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>
									
									<font color="orange">03</font>
									.<font color="orange">透明标价与收费</font>，配件价格与维修服务项目公示
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div id="text4" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/false.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>
									<font color="orange">04</font>
									.提供原厂零部件<font color="orange">，维护品牌，打击伪劣</font>
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div id="text5" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/quality.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>
									<font color="orange"> 05</font>
									.进厂<font color="orange">一次修好</font>，专业技术与品质保证
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div id="text6" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/InTime.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>
									<font color="orange">06</font>
									.保证<font color="orange">准时交车</font>，服务流动主动掌控与畅通
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div id="text7" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/save.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>
									<font color="orange">07</font>
									.道路救援服务，服务延伸，<font color="orange">全程呵护</font>
							</li>
							<li class="list-group-item" style="padding: 35px 15px;border: 2px solid #DDDDDD;">
                                 
								<div id="text8" style="font-size: 30px ;font-weight: bold;">
									<img src="${path}/img/four/follow.png" style=" margin-top: 0px;
    margin-left: 0px;height: 65px"/>
									<font color="orange">08</font>
									.服务追踪回访，维修服务跟踪与<font color="orange">预防再发</font>
							</li>
						
							
						
					</ul>
			</div>
			</div>
			
		</div>
		<!--关爱服务结束-->
		
		<!--引入jquery文件-->
		<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
		<!--引入bootstrap.js-->
		<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.js" ></script>
	</body>
</html>
