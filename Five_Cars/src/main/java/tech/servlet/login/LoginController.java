package tech.servlet.login;

import tech.aistar.dao.IUserDao;
import tech.aistar.dao.impl.UserDaoImpl;
import tech.aistar.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wubin on 2019/1/11.
 */
@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求需要进行手动的配置来处理中文乱码
        //并且是在接受数据之前进行设置
        req.setCharacterEncoding("utf-8");

        //获取表单中的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        System.out.println("username:"+username);
//        System.out.println("password:"+password);


        IUserDao userDao = new UserDaoImpl();
        User user = userDao.getByUserName(username);
//        System.out.println(user.getPassword());
        //用户名不存在
        if(user == null){
            resp.sendRedirect("/Five_Cars/jsp/one/loginfail1.jsp");
            return;
        }

        //登录成功
        if(password.equals(user.getPassword())){
            resp.sendRedirect("/Five_Cars/jsp/one/index.jsp");
            return;
        }

        //密码错误
        resp.sendRedirect("/Five_Cars/jsp/one/loginfail2.jsp");
//        System.out.println(user.getPassword());
    }
}
