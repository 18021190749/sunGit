package com.study.designpattern._3decorator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-26 20:44
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("打扮的"+name);
    }
}
