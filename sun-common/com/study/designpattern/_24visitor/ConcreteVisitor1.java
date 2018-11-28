package com.study.designpattern._24visitor;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 15:44
 */
public class ConcreteVisitor1 extends Visitor{

    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        concreteElementA.operation();
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        concreteElementB.like();
    }
}
