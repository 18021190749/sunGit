package com.study.test.builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 14:02
 */
public class ConcreteBuilder extends Builder{
    private People people;

    public ConcreteBuilder() {
        this.people = new People();
    }

    @Override
    public void createHand() {
        people.setHands("手");
    }

    @Override
    public void createHead() {
        people.setHead("头");
    }

    @Override
    public void createBody() {
        people.setBody("身体");
    }

    @Override
    public People buildPeople() {
        return people;
    }

}
