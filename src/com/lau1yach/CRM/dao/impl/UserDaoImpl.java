package com.lau1yach.CRM.dao.impl;

import com.lau1yach.CRM.dao.UserDao;
import com.lau1yach.CRM.entity.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author lyhpl
 * @Title: UserDaoImpl
 * @ProjectName CRM
 * @Description: TODO
 * @date 9/18/2018  5:30 PM
 */
@Repository
@Transactional
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
//    保存用户
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public User login(User user) {
        List<User> list= (List<User>) this.getHibernateTemplate().find("from User  where user_code=? and user_password=?",user.getUser_code(),user.getUser_password());
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
