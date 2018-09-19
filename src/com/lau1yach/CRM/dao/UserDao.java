package com.lau1yach.CRM.dao;

import com.lau1yach.CRM.entity.User;

public interface UserDao {
    void save(User user);

    User login(User user);
}
