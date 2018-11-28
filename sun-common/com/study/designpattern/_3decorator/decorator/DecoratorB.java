package com.study.designpattern._3decorator.decorator;

import com.study.designpattern._3decorator.Component;
import com.study.designpattern._3decorator.Decorator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-26 20:30
 */
public class DecoratorB extends Decorator{

    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        System.out.println("B");
        this.component.operation();
    }
}
