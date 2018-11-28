package com.study.designpattern._3decorator.decorator;

import com.study.designpattern._3decorator.Component;
import com.study.designpattern._3decorator.Decorator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-26 20:28
 */
public class DecoratorA extends Decorator{

    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        System.out.println("A");
        this.component.operation();
    }
}
