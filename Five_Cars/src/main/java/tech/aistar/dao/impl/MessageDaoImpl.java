package tech.aistar.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tech.aistar.dao.IMessageDao;
import tech.aistar.entity.Appointment;
import tech.aistar.entity.Message;
import tech.aistar.entity.User;
import tech.aistar.util.HibernateUtil;

import java.util.List;

/**
 * Created by wubin on 2019/1/12.
 */
public class MessageDaoImpl implements IMessageDao {

    @Override
    public List<Message> findAll() {
        //Hibernate经典编程步骤
        //1.获取Session
        Session session = HibernateUtil.getSession();
        //2.打开事务
        Transaction tx = session.beginTransaction();

        //3.我们具体的CRUD操作
        //org.hibernate.Session中提供了CRUD方法

        String hql = "from Message m";
        //获取  query对象
        Query query =  session.createQuery(hql);
        //获取一个集合对象
        List<Message> messages = query.list();


        //  String hql = "from User u where u.username=?";
        //  session.createQuery(hql).setParameter(1,username);

        //4.提交事务
        tx.commit();
        //5.关闭session
        session.close();

        return messages;
    }

    @Override
    public void save(Message message) {
        //Hibernate经典编程步骤
        //1.获取Session
        Session session = HibernateUtil.getSession();
        //2.打开事务
        Transaction tx = session.beginTransaction();

        //3.我们具体的CRUD操作
        //org.hibernate.Session中提供了CRUD方法
        session.save(message);

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
