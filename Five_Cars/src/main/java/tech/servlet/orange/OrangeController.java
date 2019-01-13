package tech.servlet.orange;

import service.Impl.IMessageService;
import tech.aistar.dao.IAppointmentDao;
import tech.aistar.dao.IMessageDao;
import tech.aistar.dao.impl.AppointmentDaoImpl;
import tech.aistar.dao.impl.MessageDaoImpl;
import tech.aistar.entity.Appointment;
import tech.aistar.entity.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by wubin on 2019/1/12.
 */
@WebServlet(urlPatterns = "/orange")
public class OrangeController extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求需要进行手动的配置来处理中文乱码
        //并且是在接受数据之前进行设置
        req.setCharacterEncoding("utf-8");

        //获取表单中的数据
        String username = req.getParameter("username");
        String phone = req.getParameter("phone");
        String content = req.getParameter("content");
//        System.out.println("username:"+username);
//        System.out.println("password:"+password);
//        System.out.println("phone:"+phone);
//        System.out.println("address:"+address);

        IMessageDao messageDao = new MessageDaoImpl();

        //写入数据库
//        User user = new User();
        Message message = new Message();
        message.setUsername(username);
        message.setPhone(phone);
        message.setContent(content);

        messageDao.save(message);

        //获取所有的图书信息
        List<Message> messages = messageDao.findAll();

        //将留言放入到request作用域
        req.setAttribute("messageList",messages);

        //转发
        req.getRequestDispatcher("/jsp/one/orange.jsp").forward(req,resp);

        //重定向
        resp.sendRedirect("/Five_Cars/jsp/one/orangesuccess.jsp");
    }

}
