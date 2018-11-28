package com.study.designpattern._3decorator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-26 20:48
 */
public class Finery extends Person {
    private Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show(){
        person.show();
    }
}
