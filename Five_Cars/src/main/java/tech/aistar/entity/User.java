package tech.aistar.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户实体类
 */
//自动映射的表的名称
@Table(name="t_user")
//标识它是一个实体类
@Entity
public class User implements Serializable{
    //对象标识
    private Integer id;

    //用户名
    private String username;

    //密码
    private String password;

    //电话
    private String phone;

    //住址
    private String address;


    //提供空参构造
    public User(){

    }

    //快速生成带参构造以及getter/setter  toString
    //使用快捷键alt + insert
    //id属性是不需要提供的
    public User(String username, String password, String phone, String address) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    //配置主键的生成策略
    //id是唯一的,自动生成的
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", address='").append(address);
        sb.append('}');
        return sb.toString();
    }
}
