package com.lau1yach.CRM.web.action;

import com.lau1yach.CRM.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author lyhpl
 * @Title: UserAction
 * @ProjectName CRM
 * @Description: TODO
 * @date 9/18/2018  5:33 PM
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user=new User();
    @Override
    public User getModel() {
        return user;
    }
}
