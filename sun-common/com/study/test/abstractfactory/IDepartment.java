package com.study.test.abstractfactory;

import com.study.test.abstractfactory.entity.Department;

/**
 * ${DESCRIPTION}
 * 部门抽象类
 *
 * @author sunjie
 * @create 2018-08-24 9:35
 */
public abstract class IDepartment {
    public abstract void addDepartment(Department department);

    public abstract Department getDepartmentById(String id);
}
