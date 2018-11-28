package com.sun.dao;

import com.sun.ormMappings.User;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-16 15:06
 */
public interface UserDao {
    User findById(int id);
    int save(User user);
}
