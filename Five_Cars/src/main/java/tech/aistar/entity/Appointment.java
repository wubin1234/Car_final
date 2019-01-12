package tech.aistar.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户实体类
 */
//自动映射的表的名称
@Table(name="t_appointment")
//标识它是一个实体类
@Entity
public class Appointment implements Serializable {
    //对象标识
    private Integer id;

    //用户名
    private String username;

    //电话
    private String phone;

    //时间
    private String time;

    //省份
    private String province;

    //城市
    private String city;

    //经销商
    private String distributor;

    //提供空参构造
    public Appointment(){

    }

    //快速生成带参构造以及getter/setter  toString
    //使用快捷键alt + insert
    //id属性是不需要提供的


    public Appointment(String username, String phone, String time, String province, String city, String distributor) {
        this.username = username;
        this.phone = phone;
        this.time = time;
        this.province = province;
        this.city = city;
        this.distributor = distributor;
    }

    //配置主键的生成策略
    //id是唯一的,自动生成的
    @Id
    @GeneratedValue
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

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
    public String getTime() {
        return time;
    }

    @Column
    public String getProvince() {
        return province;
    }

    @Column
    public String getCity() {
        return city;
    }

    @Column
    public String getDistributor() {
        return distributor;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", time='" + time + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", distributor='" + distributor + '\'' +
                '}';
    }
}
