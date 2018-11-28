package com.study.designpattern._22flyweight;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:05
 */
public class UnsharedConcreteFlyWeight extends AbstractFlyWeight {
    @Override
    public void operation(int storage) {
        System.out.println("不共享" + storage);
    }
}
