package com.study.designpattern._11abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 14:59
 */
public abstract class BmwCar implements Car{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
