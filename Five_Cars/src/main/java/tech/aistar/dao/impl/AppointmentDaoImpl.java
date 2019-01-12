package tech.aistar.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tech.aistar.dao.IAppointmentDao;
import tech.aistar.entity.Appointment;
import tech.aistar.entity.User;
import tech.aistar.util.HibernateUtil;

/**
 * Created by wubin on 2019/1/12.
 */
public class AppointmentDaoImpl implements IAppointmentDao {

    @Override
    public void save(Appointment appointment) {
        //Hibernate经典编程步骤
        //1.获取Session
        Session session = HibernateUtil.getSession();
        //2.打开事务
        Transaction tx = session.beginTransaction();

        //3.我们具体的CRUD操作
        //org.hibernate.Session中提供了CRUD方法
        session.save(appointment);

        //4.提交事务
        tx.commit();
        //5.关闭session
        session.close();
    }

    @Override
    public void delById(Integer id) {

    }

    @Override
    public User getByUserName(String username) {
        return null;
    }
}
