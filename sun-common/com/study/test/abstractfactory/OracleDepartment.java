package com.study.test.abstractfactory;

import com.study.test.abstractfactory.entity.Department;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 9:45
 */
public class OracleDepartment extends IDepartment{
    @Override
    public void addDepartment(Department department) {
        System.out.println("新增oracle部门");
    }

    @Override
    public Department getDepartmentById(String id) {
        System.out.println("oracle根据id查部门");
        return new Department("1","测试","2");
    }
}
