package com.study.test.abstractfactory;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 11:28
 */
public class AccessDatabase {
    public IUser createUser(String param) throws Exception {
        return (IUser) Class.forName(param).newInstance();
    }

    public IDepartment createDepartment(String param) throws Exception {
        return (IDepartment) Class.forName(param).newInstance();
    }
}
