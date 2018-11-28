package com.study.test.abstractfactory;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 9:54
 */
public class OracleDatabase extends DataBase {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
