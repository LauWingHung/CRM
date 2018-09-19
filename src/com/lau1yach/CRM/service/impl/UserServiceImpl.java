package com.lau1yach.CRM.service.impl;

import com.lau1yach.CRM.dao.UserDao;
import com.lau1yach.CRM.entity.User;
import com.lau1yach.CRM.service.UserService;
import com.lau1yach.CRM.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lyhpl
 * @Title: UserServiceImpl
 * @ProjectName CRM
 * @Description: TODO
 * @date 9/18/2018  5:32 PM
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void regist(User user){
//        对密码进行加密
        String password= MD5Utils.md5(user.getUser_password());
        user.setUser_password(password);
        user.setUser_state("1");
//        调用DAO
        userDao.save(user);
    }

    @Override
    public User login(User user) {
        user.setUser_password(MD5Utils.md5(user.getUser_password()));
        return userDao.login(user);

    }
}
