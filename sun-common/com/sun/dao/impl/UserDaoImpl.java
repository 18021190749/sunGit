package com.sun.dao.impl;

import com.sun.dao.UserDao;
import com.sun.ormMappings.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-16 15:07
 */
@Repository
public class UserDaoImpl implements UserDao {
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User findById(int id) {
        return (User) currentSession().get(User.class, id);
    }

    @Override
    public int save(User user) {
        Serializable id = currentSession().save(user);
        return (int) id;
    }
}
