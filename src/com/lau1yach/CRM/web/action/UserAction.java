package com.lau1yach.CRM.web.action;

import com.lau1yach.CRM.entity.User;
import com.lau1yach.CRM.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author lyhpl
 * @Title: UserAction
 * @ProjectName CRM
 * @Description: TODO
 * @date 9/18/2018  5:33 PM
 */
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user=new User();
    @Override
    public User getModel() {
        return user;
    }
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    /*    public String registUI(){
        return "regist.jsp";
    }*/

    public String regist(){
        userService.regist(user);
        return LOGIN;
    }
    public String login(){
//        调用业务层查询用户
        User exisUser=userService.login(user);
        if (exisUser == null){
            //登录失败
            //添加错误信息
            this.addActionError("用户名或密码错误!");
            return LOGIN;
        }else {
            //登录成功
            ActionContext.getContext().getSession().put("exisUser",exisUser);
            return SUCCESS;
        }
    }
}
