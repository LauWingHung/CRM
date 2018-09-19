package com.lau1yach.CRM.service;

import com.lau1yach.CRM.entity.User;

public interface UserService {
    void regist(User user);

    User login(User user);
}
