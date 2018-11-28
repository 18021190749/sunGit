package com.study.designpattern._15composite;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-20 14:17
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);

    public abstract void remove(Company c);

    public abstract void display(int index);

    public abstract void onDuty();
}
