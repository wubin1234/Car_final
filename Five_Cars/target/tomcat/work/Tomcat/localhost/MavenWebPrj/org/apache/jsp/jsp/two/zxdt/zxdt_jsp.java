/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-10 09:12:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.two.zxdt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zxdt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/jsp/two/zxdt/../../common/nar.jsp", Long.valueOf(1547107595482L));
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>资讯动态-大乘汽车</title>\r\n");
      out.write("    <!--引入bootstrap.min.css文件-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/navbar.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/two/two.css\"/>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--响应式导航-->\r\n");
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
      out.write("<!--响应式导航结束-->\r\n");
      out.write("<div class=\"carousel-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"ad\" style=\"height: auto;position: relative; overflow: hidden;\">\r\n");
      out.write("            <video autoplay=\"true\" class=\"pcitem\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/11.mp4\" style=\"width: 100%;    display: inline-block;\r\n");
      out.write("    vertical-align: baseline;\"></video>\r\n");
      out.write("            <div class=\"bgimg mobitem\" style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/6.jpg)\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"jumbotron\" style=\"text-align: center;\">\r\n");
      out.write("        <h1>视频集锦</h1>\r\n");
      out.write("        <h1>Video collection</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/31.png\"\r\n");
      out.write("                     alt=\"通用的占位符缩略图\">\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h3>大乘G70S燃情快感，一触即发</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <!-- 按钮触发模态框 -->\r\n");
      out.write("                        <button class=\"return\" data-toggle=\"modal\" data-target=\"#myModal\">播放</button>\r\n");
      out.write("                        <!-- 模态框（Modal） -->\r\n");
      out.write("                    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                        <div class=\"modal-dialog\">\r\n");
      out.write("                            <div class=\"modal-content\" >\r\n");
      out.write("                                <div class=\"modal-header\">\r\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                                    <h4 class=\"modal-title\" id=\"myModalLabel\">大乘G70S燃情快感，一触即发</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-body\"> <video controls class=\"pcitem\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/12.mp4\" style=\"width: 100%;    display: inline-block;\r\n");
      out.write("    vertical-align: baseline;\"></video></div>\r\n");
      out.write("\r\n");
      out.write("                            </div><!-- /.modal-content -->\r\n");
      out.write("                        </div><!-- /.modal -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/32.jpg\"\r\n");
      out.write("                     alt=\"通用的占位符缩略图\">\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h3>承载青春梦想</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <!-- 按钮触发模态框 -->\r\n");
      out.write("                        <button class=\"return\" data-toggle=\"modal\" data-target=\"#myModa2\">播放</button>\r\n");
      out.write("                        <!-- 模态框（Modal） -->\r\n");
      out.write("                    <div class=\"modal fade\" id=\"myModa2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                        <div class=\"modal-dialog\">\r\n");
      out.write("                            <div class=\"modal-content\">\r\n");
      out.write("                                <div class=\"modal-header\">\r\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                                    <h4 class=\"modal-title\" id=\"myModalLabel\">承载青春梦想</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-body\"> <video controls class=\"pcitem\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/13.mp4\" style=\"width: 100%;    display: inline-block;\r\n");
      out.write("    vertical-align: baseline;\"></video></div>\r\n");
      out.write("\r\n");
      out.write("                            </div><!-- /.modal-content -->\r\n");
      out.write("                        </div><!-- /.modal -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/33.jpg\"\r\n");
      out.write("                     alt=\"通用的占位符缩略图\">\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h3>动感科技 智能设计</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <!-- 按钮触发模态框 -->\r\n");
      out.write("                        <button class=\"return\" data-toggle=\"modal\" data-target=\"#myModa3\">播放</button>\r\n");
      out.write("                        <!-- 模态框（Modal） -->\r\n");
      out.write("                    <div class=\"modal fade\" id=\"myModa3\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" >\r\n");
      out.write("                        <div class=\"modal-dialog\">\r\n");
      out.write("                            <div class=\"modal-content\">\r\n");
      out.write("                                <div class=\"modal-header\">\r\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                                    <h4 class=\"modal-title\" id=\"myModalLabel\">动感科技 智能设计</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-body\"> <video controls class=\"pcitem\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/14.mp4\" style=\"width: 100%;    display: inline-block;\r\n");
      out.write("    vertical-align: baseline;\"></video></div>\r\n");
      out.write("\r\n");
      out.write("                            </div><!-- /.modal-content -->\r\n");
      out.write("                        </div><!-- /.modal -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/34.jpg\"\r\n");
      out.write("                     alt=\"通用的占位符缩略图\">\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h3>智能互联+传统车企的工匠精神</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <!-- 按钮触发模态框 -->\r\n");
      out.write("                        <button class=\"return\" data-toggle=\"modal\" data-target=\"#myModa4\">播放</button>\r\n");
      out.write("                        <!-- 模态框（Modal） -->\r\n");
      out.write("                    <div class=\"modal fade\" id=\"myModa4\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                        <div class=\"modal-dialog\">\r\n");
      out.write("                            <div class=\"modal-content\">\r\n");
      out.write("                                <div class=\"modal-header\">\r\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                                    <h4 class=\"modal-title\" id=\"myModalLabel\">大乘G70S燃情快感，一触即发</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-body\"> <video controls class=\"pcitem\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/two/15.mp4\" style=\"width: 100%;    display: inline-block;\r\n");
      out.write("    vertical-align: baseline;\"></video></div>\r\n");
      out.write("\r\n");
      out.write("                            </div><!-- /.modal-content -->\r\n");
      out.write("                        </div><!-- /.modal -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--引入jquery文件-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jquery/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--引入bootstrap.js-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/js/bootstrap.min.js\" ></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
