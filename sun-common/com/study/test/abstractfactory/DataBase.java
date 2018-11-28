package com.study.test.abstractfactory;

/**
 * ${DESCRIPTION}
 * 抽象数据库
 * @author sunjie
 * @create 2018-08-24 9:33
 */
public abstract class DataBase {
    public abstract IUser createUser();
    public abstract IDepartment createDepartment();
}
