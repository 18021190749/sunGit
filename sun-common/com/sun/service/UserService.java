package com.sun.service;

import com.sun.dao.UserDao;
import com.sun.ormMappings.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-16 19:01
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User getUserById(Integer id){
        return userDao.findById(id);
    }
}
