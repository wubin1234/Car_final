package com.aistar.dao;

import org.junit.Test;
import tech.aistar.dao.IAppointmentDao;
import tech.aistar.dao.IMessageDao;
import tech.aistar.dao.impl.AppointmentDaoImpl;
import tech.aistar.dao.impl.MessageDaoImpl;
import tech.aistar.entity.Appointment;
import tech.aistar.entity.Message;
import tech.aistar.entity.User;

import java.util.List;

/**
 * Created by wubin on 2019/1/12.
 */
public class TestMessage {
    //声明接口对象
    //接口 对象名 = new 实现类
    //OO - 面向接口编程
    IMessageDao messageDao = new MessageDaoImpl();
    @Test
    public void testSave(){
        //模拟一些测试数据
        Message message = new Message();
        message.setUsername("吴彬");
        message.setPhone("123");
        message.setContent("我是谁");


        //调用接口中的保存方法
        messageDao.save(message);
    }
    @Test
    public void testFindByUserName(){
        return;
    }

    @Test
    public void testFindAll(){
        List<Message> list = messageDao.findAll();
        for(Message m:list){
            System.out.println(m);
        }
    }

}