package tech.aistar.dao;

import tech.aistar.entity.Appointment;
import tech.aistar.entity.Message;
import tech.aistar.entity.User;

import java.util.List;

/**
 * Created by wubin on 2019/1/12.
 */
public interface IMessageDao {
    /**
     * 保存用户
     * @param message
     */
    void save(Message message);

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

    /**
     * 查询所有的图书
     * @return
     */
    List<Message> findAll();
}
