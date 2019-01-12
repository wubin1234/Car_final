package com.aistar.dao;


import org.junit.Test;
import tech.aistar.dao.IAppointmentDao;
import tech.aistar.dao.IUserDao;
import tech.aistar.dao.impl.AppointmentDaoImpl;
import tech.aistar.entity.Appointment;
import tech.aistar.entity.User;

/**
 * Created by Administrator on 2019/1/9 0009.
 */
public class TestAppointment {
    //声明接口对象
    //接口 对象名 = new 实现类
    //OO - 面向接口编程
    IAppointmentDao appointmentDao = new AppointmentDaoImpl();

    @Test
    public void testSave(){
        //模拟一些测试数据
        Appointment appointment = new Appointment();
        appointment.setUsername("吴彬");
        appointment.setTime("2019-1-1");
        appointment.setProvince("江苏省");
        appointment.setCity("南京市");
        appointment.setDistributor("经销商");
        appointment.getPhone();

        //调用接口中的保存方法
        appointmentDao.save(appointment);
    }
    @Test
    public void testFindByUserName(){
        User user = appointmentDao.getByUserName("456");
        System.out.println(user);
    }
}