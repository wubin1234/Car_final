package service.Impl;

import tech.aistar.entity.Message;

import java.util.List;

/**
 * Created by wubin on 2019/1/13.
 */
public interface IMessageService {
    /**
     * 查询所有的图书
     * @return
     */
    List<Message> findAll();
}
