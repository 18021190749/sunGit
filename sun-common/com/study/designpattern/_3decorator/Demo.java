package com.study.designpattern._3decorator;

import com.study.designpattern._3decorator.componentImpl.ConcreteComponent;
import com.study.designpattern._3decorator.decorator.DecoratorA;
import com.study.designpattern._3decorator.decorator.DecoratorB;

/**
 * ${DESCRIPTION}
 * 装饰模式
 * @author sunjie
 * @create 2018-07-26 20:20
 */
public class Demo {
    public static void main(String[] args) {
        /*Component c= new DecoratorA(new ConcreteComponent());
        c.operation();*/
        Component c = new ConcreteComponent();
        DecoratorA a = new DecoratorA(c);
        DecoratorB b =new DecoratorB(a);
        b.operation();
    }
}
