package com.study.designpattern._3decorator.componentImpl;

import com.study.designpattern._3decorator.Component;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-26 20:26
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("operation");
    }
}
