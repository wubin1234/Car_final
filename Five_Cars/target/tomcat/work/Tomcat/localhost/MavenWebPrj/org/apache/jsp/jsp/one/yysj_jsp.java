/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 07:37:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.one;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yysj_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/jsp/one/../common/nar.jsp", Long.valueOf(1547019084413L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <!--引入bootstrap.min.css文件-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../../plugins/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("    <!--引入自定义css文件-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/navbar.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/one/index.css\" />\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .background {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 400px;\r\n");
      out.write("            left: 784px;\r\n");
      out.write("            z-index: -2;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #F5F5F5;\">\r\n");
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
      out.write("                                        <a href=\"#\">最新活动</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">精彩回顾</a>\r\n");
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
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"title\" style=\"text-align: center;\">\r\n");
      out.write("            <h1>预约试驾</h1>\r\n");
      out.write("            <h1>Dorcen Test Drive</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--表单开始-->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"submit\" style=\"margin-top: 30px;\">\r\n");
      out.write("            <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"firstname\" class=\"col-sm-2 control-label\">选择车型:</label>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <div class=\"dropdown\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\">G70S\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("                                <li role=\"presentation\">\r\n");
      out.write("                                    <a role=\"menuitem\" tabindex=\"-1\" href=\"#\">G70S</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li role=\"presentation\">\r\n");
      out.write("                                    <a role=\"menuitem\" tabindex=\"-1\" href=\"#\">SUV</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <div class=\"dropdown\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\">豪华型\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("                                <li role=\"presentation\">\r\n");
      out.write("                                    <a role=\"menuitem\" tabindex=\"-1\" href=\"#\">豪华型</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li role=\"presentation\">\r\n");
      out.write("                                    <a role=\"menuitem\" tabindex=\"-1\" href=\"#\">尊贵型</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li role=\"presentation\">\r\n");
      out.write("                                    <a role=\"menuitem\" tabindex=\"-1\" href=\"#\">至尊型</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li role=\"presentation\">\r\n");
      out.write("                                    <a role=\"menuitem\" tabindex=\"-1\" href=\"#\">旗舰型</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"lastname\" class=\"col-sm-2 control-label\">填写信息:</label>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <h3>姓名</h3>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control col-md-2\" id=\"lastname\" placeholder=\"请输入姓名\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <h3>电话</h3>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control col-md-2\" id=\"lastname\" placeholder=\"请输入电话\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <h3>时间</h3>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control col-md-2\" id=\"lastname\" placeholder=\"请输入时间\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"lastname\" class=\"col-sm-2 control-label\">经销商:</label>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <h3>省份</h3>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control col-md-2\" id=\"lastname\" placeholder=\"请输入省份\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <h3>城市</h3>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control col-md-2\" id=\"lastname\" placeholder=\"请输入城市\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <h3>经销商</h3>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control col-md-2\" id=\"lastname\" placeholder=\"请输入经销商\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\" style=\"margin-top: 30px;\">\r\n");
      out.write("                    <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">立即预约</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"background\">\r\n");
      out.write("                        <img src=\"../../img/one/yysj_first.jpg\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!--表单结束-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!--\r\n");
      out.write("    引入jquery文件\r\n");
      out.write("-->\r\n");
      out.write("<script src=\"../../plugins/jquery/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--\r\n");
      out.write("    引入bootstrap.js\r\n");
      out.write("-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../plugins/bootstrap/js/bootstrap.js\"></script>\r\n");
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
