package tech.servlet.register;

import com.sun.net.httpserver.HttpsServer;
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

@WebServlet(urlPatterns = "/register")
public class RegisterController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求需要进行手动的配置来处理中文乱码
        //并且是在接受数据之前进行设置
        req.setCharacterEncoding("utf-8");

        //获取表单中的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        if((username =="")||(password =="")||(phone =="")||(address == "")){
            resp.sendRedirect("/Five_Cars/jsp/one/registerfail.jsp");
            return;
        }
//        System.out.println("username:"+username);
//        System.out.println("password:"+password);
//        System.out.println("phone:"+phone);
//        System.out.println("address:"+address);

        IUserDao userDao = new UserDaoImpl();

        //写入数据库
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhone(phone);
        user.setAddress(address);
        userDao.save(user);

        //重定向
        resp.sendRedirect("/Five_Cars/jsp/one/login.jsp");
    }
}

