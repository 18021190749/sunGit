package com.study.test.abstractfactory;

import com.study.test.abstractfactory.entity.User;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 9:48
 */
public class MysqlUser extends IUser{
    @Override
    public void addUser(User user) {
        System.out.println("mysql新增用户");
    }

    @Override
    public User getUserById(String id) {
        System.out.println("mysql获取用户");
        return null;
    }
}
