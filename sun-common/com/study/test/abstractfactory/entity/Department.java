package com.study.test.abstractfactory.entity;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 9:38
 */
public class Department {
    /**
     * id : 1
     * name : 测试
     * pid : 2
     */

    private String id;
    private String name;
    private String pid;

    public Department() {
    }

    public Department(String id, String name, String pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
