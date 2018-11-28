package com.study.designpattern._24visitor;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 15:56
 */
public class Demo {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());
        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();
        objectStructure.accept(concreteVisitor1);
        objectStructure.accept(concreteVisitor2);
    }
}
