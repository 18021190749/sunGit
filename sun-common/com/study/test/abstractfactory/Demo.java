package com.study.test.abstractfactory;

import com.study.test.abstractfactory.entity.Department;

import java.io.FileReader;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 10:02
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        DataBase dataBase = new MysqlDatabase();
        IDepartment department = dataBase.createDepartment();
        department.addDepartment(new Department());
        department.getDepartmentById("1");
        /************************************/
        AccessDatabase accessDatabase = new AccessDatabase();
        Properties properties = new Properties();
        properties.load(new FileReader("E:\\sunDemo\\sun-common\\com\\study\\test\\abstractfactory\\param.properties"));
        String className = properties.getProperty("className");
        accessDatabase.createDepartment("com.study.test.abstractfactory.MysqlDepartment").addDepartment(new Department());
        accessDatabase.createDepartment(className).getDepartmentById("1");
    }
}
