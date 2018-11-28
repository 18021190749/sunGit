package com.study.designpattern._24visitor;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 15:47
 */
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
    }

    public void like(){
        System.out.println("B喜欢");
    }
}
