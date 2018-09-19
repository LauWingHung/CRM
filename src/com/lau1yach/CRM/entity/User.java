package com.lau1yach.CRM.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * @author lyhpl
 * @Title: User
 * @ProjectName CRM
 * @Description: TODO
 * @date 9/18/2018  5:28 PM
 */
@Entity
@Table(name = "sys_user")
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @GenericGenerator(name = "user_id", strategy = "native")
    private long user_id;
    @Column(name = "user_code")
    private String user_code;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "user_password")
    private String user_password;
    @Column(name = "user_state")
    private String user_state;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }
}
