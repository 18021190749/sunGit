package com.study.designpattern._24visitor;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 15:47
 */
public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
    }

    public void operation(){
        System.out.println("A操作");
    }
}
