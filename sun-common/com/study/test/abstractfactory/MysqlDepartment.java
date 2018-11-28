package com.study.test.abstractfactory;

import com.study.test.abstractfactory.entity.Department;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 9:47
 */
public class MysqlDepartment extends IDepartment{
    @Override
    public void addDepartment(Department department) {
        System.out.println("mysql新增部门");
    }

    @Override
    public Department getDepartmentById(String id) {
        System.out.println("mysql根据id获取部门");
        return null;
    }
}
