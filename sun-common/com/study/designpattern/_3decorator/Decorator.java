package com.study.designpattern._3decorator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-26 20:27
 */
public abstract class Decorator implements Component{
    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void operation(){
        this.component.operation();
    }
}
