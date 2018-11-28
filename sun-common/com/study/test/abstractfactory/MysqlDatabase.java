package com.study.test.abstractfactory;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 10:00
 */
public class MysqlDatabase extends DataBase {

    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }
}
