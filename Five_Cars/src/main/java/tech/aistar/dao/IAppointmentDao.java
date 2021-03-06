package tech.aistar.dao;

import tech.aistar.entity.Appointment;
import tech.aistar.entity.User;

/**
 * Created by wubin on 2019/1/12.
 */
public interface IAppointmentDao {
    /**
     * 保存用户
     * @param appointment
     */
    void save(Appointment appointment);

    /**
     * 根据id进行删除操作.
     * @param id
     */
    void delById(Integer id);
    /**
     * 根据用户名查找用户
     * @param username 传入的用户名
     * @return 该用户名对应的的单个用户对象
     */
    User getByUserName(String username);

}
