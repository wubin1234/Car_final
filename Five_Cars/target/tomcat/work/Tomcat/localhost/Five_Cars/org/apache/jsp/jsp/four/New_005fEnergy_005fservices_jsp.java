/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-11 07:31:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.four;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class New_005fEnergy_005fservices_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/jsp/four/../common/nar.jsp", Long.valueOf(1547110034270L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<!--引入bootstrap.min.css文件-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../plugins/bootstrap/css/bootstrap.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/navbar.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/four/New_Energy_services.css\"/>\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!--响应式导航-->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#example-navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">切换导航</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/one/index.jsp\">大乘汽车</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"example-navbar-collapse\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav nar navbar-right\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/one/login.jsp\">登录注册</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/four/Business_cooperation.jsp\">商务合作</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/two/ppcx/ppcx.jsp\">品牌车型</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    大乘天地\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/three/Overview.jsp\">大乘概述</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/three/Positioning.jsp\">品牌定位</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/three/Promise.jsp\">大乘承诺</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    资讯动态\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/two/zxdt/xwdt.jsp\">新闻动态</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/two/zxdt/zxdt.jsp\">视屏集锦</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    关爱服务\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/four/Care_service.jsp\">关爱服务</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/four/New_Energy_services.jsp\">新能源服务</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    更多服务\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/one/yysj.jsp\">预约试驾</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/one/orange.jsp\">橙子俱乐部</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    会员活动\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/five/huiyuan.jsp\">最新活动</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/five/new_file.jsp\">精彩回顾</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--响应式导航结束-->\r\n");
      out.write("\t\t<!--新能源服务开始-->\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div id=\"firstname\" style=\"background-image: url(../../img/four/service.jpg);\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"text-center\" style=\"font-size: 50px;font-weight: bold;line-height: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t<p>新能源服务</p>\r\n");
      out.write("\t\t\t\t\t\t<p>New Energy Servise</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div  id=\"body\" style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/four/Setting.png);\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/four/service-logo.png\" />\r\n");
      out.write("\t\t\t\t<div class=\"text\" style=\"font-size: 20px;\">\r\n");
      out.write("\t\t\t\t\t江西大乘汽车有限公司金坛分公司（以下简称大乘汽车金坛分公司）依据《消费者权益保护法》、《产品质量法》、《缺陷汽车产品召回管理条例》、 《家用汽车产品修理、更换、退货责任规定》等相关法律法规的要求，制定产品售后服务保证承诺，接受广大用户和社会各界人士的监督。\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"http://www.dorcen.com/bocweb//web/img/1.pdf?v=v111\">新能源售后保证(下载)</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel-group\" id=\"accordion\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseOne\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 1.质量保证承诺</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseOne\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>主要对整车备件做出了三包期限规定：主要包括底盘类、车身及附件、电器及温控系统等，\r\n");
      out.write("\t\t\t\t\t\t\t\t如动力电池总成、驱动电机、电机控制器保修期限为8年或12万公里，具体见发布的《保修手册》。\r\n");
      out.write("\t\t\t\t\t\t\t\t从电池生产源头实行MES自动化信息管理，并与整车生产系统信息共享，确保工序可追溯，整车装配实行一车一电池包，\r\n");
      out.write("\t\t\t\t\t\t\t\t并通过MES系统进行匹配，保证整车产品的可追溯性，销售端引入DMS信息管理系统，统筹管理出入库和市场车辆，\r\n");
      out.write("\t\t\t\t\t\t\t\t通过信息流的打通确保电池的可追溯性。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>新能源整车质量保修期：2年或5万公里（以先到者为准）。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>质量保修期开始日期：自用户购车之日（车辆销售发票的开具日期）起计算；里程按用户购车后按里程表（正常状态下—即里程表未更换并在正常工作状态下）显示计程计算。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>具体零部件的质量保证规定及保修期限见《保修手册》。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>保修范围说明：在上述规定的保修范围内，因质量问题造成的损坏，大乘汽车可提供免费调试、维修或更换零部件，以恢复车辆的正常状态；\r\n");
      out.write("\t\t\t\t\t\t\t\t\t因质量问题造成用户的经济损失（仅限车辆修复费、拖车费），由大乘汽车赔偿。</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseTwo\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 2.备件提供及质量保证期限</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseTwo\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>大乘汽车在江苏省常州市金坛区设立售后备件专用仓库，园区内全国货运物流服务商非常发达，充分保障售后服务体系的备件供应时效。各授权经销商及服务站建立了必备的常用件库存，保障了市场客户的备件供应及时性。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>备件质量保修范围：在授权经销服务商处进行有偿修理时，使用原厂纯正零件因材质或制造上的缺陷引起的故障属于零件保修范围。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>备件质量保修期开始日期：大乘汽车授权经销服务商零件销售日期（以销售发票开具日期为准）或维修记录上登记的备件更换日期；里程从授权经销服务商处汽车维修记录表上登记的里程数起计。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>备件质量保修期：在成品车辆前次维修后，因更换的同一零件由于质量问题发生的故障，其保修期为2个月内或行驶里程在5000公里内，两个条件任何一个先超过即超过保修期。</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseThree\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 3.维修保养服务授理单位</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseThree\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>新能源汽车推广应用城市任意一家大乘维修站维修保养，若维修站解决不了，质保期内提供免费上门服务。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseFour\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 4.维修立即响应及现场服务</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseFour\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>公司设有24小时免费咨询电话400-890-5678，接受用户的咨询、投诉与建议，同时要求各个服务网点必须配备24小时热线电话，接收客户反馈信息、快速反应及处理客户车辆遇到的问题。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>当车辆出现故障，导致车辆无法行驶或事故存在严重安全隐患，且通过远程指导无法排查故障时，服务网点提供24小时救援服务，及时赶到救援现场为用户排除故障。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>遇到服务网点无法及时解决的故障问题，公司收到信息后，将第一时间派出专业技术人员到达现场，协助服务网点人员进行故障排除。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseFive\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 5.维修时间</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseFive\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>正常保养、易损件的更换8小时内修复，出现设备重大故障及大修10个工作日完成，其余维修服务在3个工作日完成，确保维修质量。</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseSix\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 6.免费首保</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseSix\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>针对每一台纯电动乘用车，提供两次免费保养，即行驶2000公里内或3个月内免收首次强保费用，行驶5000公里内或6个月内免收第二次保养费用。</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseSeven\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 7.监控及问题反馈</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseSeven\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>7.1监测平台简介</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>大乘汽车生产的纯电动乘用车根据GB32960规范要求全部安装车辆运行新能源汽车车载实时监测装置，并纳入新能源汽车监测平台管理。对纯电动乘用车动力电池、驱动电机、整车控制器等信息数据及日常运行状态进行实时监测，对可能出现的问题做到早发现、早处置，确保车辆安全运行。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>监测平台是一个智能化的监测平台，可以监测车辆的基础数据，包含车型信息、VIN信息、车辆状态、电量信息、ICCID、T-BOX号等；同时也监测车辆故障，如动力电池、驱动电机、整车控制器等故障并及时预警。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>监测平台系统满足GB/T32960等相关要求：监控周期、数据保存周期、异常情况处理、统计、上报等。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>车载终端依照整车通讯协议采集必须数据，上传到企业平台，企业平台按照国家要求格式规范提交到国家平台。国家平台对企业平台上传的信息进行管理，并将相关信息转发应急指挥、车辆管理等应用部门。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>7.2监测平台功能介绍</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>监控平台系统具备以下功能：</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>7.2.1车辆监控：可查看车辆总数、累计里程、车辆位置等；通过车架号检索，快速锁定具体车辆，查询车辆信息，并确认电池电量、电池健康度。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>7.2.2车辆管理：可通过车牌号、车架号、T-BOX设备号对车辆信息进行检索。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>7.2.3报警管理：可通过车架号检索进行车辆历史告警信息查询，如车辆报警地理位置、报警车辆数量等。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>7.2.4统计分析：可通过开始时间和结束时间可以查看下线车辆统计和激活车辆统计，可显示车辆报警统计、报警类型统计等，同时可统计累计驾驶里程、累计驾驶时间、累计电耗。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseEight\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 8.24小时服务热线</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseEight\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>大乘汽车设立全国免费服务热线400-890-5678，为客户提供7×24h全天候服务咨询、外出救援、充电服务、技术支持服务。</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseNine\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 9.安全事故应急处理制度</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseNine\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>9.1主动来电处置</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>服务公司设有24小时免费咨询电话400-890-5678，接受用户的咨询、投诉与建议，同时要求各个服务网点必须配备24小时热线电话，接收客户反馈信息，快速反映及处理客户车辆遇到的问题。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>当车辆出现质量问题，导致无法行驶或行驶存在严重安全隐患，且通过电话指导无法排查故障时，服务网点提供24小时救援服务，及时赶到救援现场为用户排查故障。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>详见《服务运营管理手册-服务政策管理篇-24小时救援服务管理办法》</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>9.2监控平台车辆报警处置</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>通过监控平台对故障车辆的定位、报警详情及报警级别，根据车辆归属地，客服中心与用户电话沟通了解车辆状况，安排用户进站维修或服务站外出救援。详见《服务运营管理手册-服务政策管理篇-监控平台报警处置管理办法》。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>9.3重大事故处置</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>公司在接到报案后，根据实际情况立即启动事故应急处置预案。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>根据预案启动的级别派工作人员到现场开展救援和善后处理工作。赶到事发现场后，工作人员按各自在事故应急处置预案中的分工开展救援和善后工作。当地政府和公安、交通等部门已经组织救援的，公司救援人员服从当地救援组织的统一指挥。当地医疗条件有限，伤员生命安全得不到保障的，公司救援人员应征得当地事故处理组织的同意，迅速将伤员转入医疗条件好的医院救治。参加现场救援和善后处理的负责人员每天应及时将现场救援和善后处理进展情况向公司领导汇报，以便开展相应的工作。详见《服务运营管理手册-基础保障篇-重大事故应急救援应急处理预案》。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseTen\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 10.免费建立客户档案及终身维修记录</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseTen\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>针对每一辆大乘汽车及每一个使用单位，建立对应的用户档案，定期进行跟踪访问，并记录所有客户服务的历史，同时并对客户的满意度进行测评。</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("                <a data-toggle=\"collapse\" data-parent=\"#accordion\" \r\n");
      out.write("                href=\"#collapseEleven\">\r\n");
      out.write("               <font style=\"font-size: 20px;font-weight: bold;line-height: 60px;\"> 11.动力电池回收</font>\r\n");
      out.write("                </a>\r\n");
      out.write("            </h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"collapseEleven\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>公司已经与动力电池供应商、动力电池回收商签订动力电池回收协议，动力电池回收商可以按国家法律法规要求回收市场更换下来的动力电池。</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--新能源服务结束-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--引入jquery文件-->\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jquery/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<!--引入bootstrap.js-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
