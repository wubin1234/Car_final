package tech.servlet.yysj;

import tech.aistar.dao.IAppointmentDao;
import tech.aistar.dao.IUserDao;
import tech.aistar.dao.impl.AppointmentDaoImpl;
import tech.aistar.dao.impl.UserDaoImpl;
import tech.aistar.entity.Appointment;
import tech.aistar.entity.User;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wubin on 2019/1/12.
 */
@WebServlet(urlPatterns = "/yysj")
public class YysjController extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求需要进行手动的配置来处理中文乱码
        //并且是在接受数据之前进行设置
        req.setCharacterEncoding("utf-8");

        //获取表单中的数据
        String username = req.getParameter("username");
        String phone = req.getParameter("phone");
        String province = req.getParameter("province");
        String time = req.getParameter("time");
        String city = req.getParameter("city");
        String distributor = req.getParameter("distributor");
//        System.out.println("username:"+username);
//        System.out.println("password:"+password);
//        System.out.println("phone:"+phone);
//        System.out.println("address:"+address);

        IAppointmentDao appointmentDao = new AppointmentDaoImpl();

        //写入数据库
//        User user = new User();
        Appointment appointment = new Appointment();
        appointment.setUsername(username);
        appointment.setPhone(phone);
        appointment.setTime(time);
        appointment.setProvince(province);
        appointment.setCity(city);
        appointment.setDistributor(distributor);
        appointmentDao.save(appointment);

        //重定向
        resp.sendRedirect("/Five_Cars/jsp/one/yysjsuccess.jsp");
    }
}
