package com.study.designpattern._21mediator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 10:35
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteUS concreteUS = new ConcreteUS();
        USA usa = new USA(concreteUS);
        Iraq iraq = new Iraq(concreteUS);
        concreteUS.setIraq(iraq);
        concreteUS.setUsa(usa);
        usa.declare("打");
        iraq.declare("跑");
    }
}
