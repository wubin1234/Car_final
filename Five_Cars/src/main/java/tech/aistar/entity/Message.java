package tech.aistar.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户实体类
 */
//自动映射的表的名称
@Table(name="t_message")
//标识它是一个实体类
@Entity
public class Message implements Serializable {
    //对象标识
    private Integer id;

    //用户名
    private String username;

    //电话
    private String phone;

    //内容
    private String content;


    //提供空参构造

    public Message() {
    }


    //快速生成带参构造以及getter/setter  toString
    //使用快捷键alt + insert
    //id属性是不需要提供的


    public Message(String username, String phone, String content) {
        this.username = username;
        this.phone = phone;
        this.content = content;
    }

    //配置主键的生成策略
    //id是唯一的,自动生成的
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    @Column
    public String getPhone() {
        return phone;
    }
    @Column
    public String getContent() {
        return content;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
