package com.study.test.builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 14:07
 */
public class Demo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        People people = new Director().buildPeople(builder);
        System.out.println(people);
    }
}
