package com.study.test.abstractfactory;

import com.study.test.abstractfactory.entity.User;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 9:49
 */
public class OracleUser extends IUser {
    @Override
    public void addUser(User user) {
        System.out.println("oracle新增用户");
    }

    @Override
    public User getUserById(String id) {
        System.out.println("oracle获取用户");
        return null;
    }
}
