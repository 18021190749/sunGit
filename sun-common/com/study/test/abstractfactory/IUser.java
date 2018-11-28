package com.study.test.abstractfactory;

import com.study.test.abstractfactory.entity.User;

/**
 * ${DESCRIPTION}
 * 用户抽象类
 *
 * @author sunjie
 * @create 2018-08-24 9:35
 */
public abstract class IUser {
    public abstract void addUser(User user);

    public abstract User getUserById(String id);
}
