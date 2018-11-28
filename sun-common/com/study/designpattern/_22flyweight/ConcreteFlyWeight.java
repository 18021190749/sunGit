package com.study.designpattern._22flyweight;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:03
 */
public class ConcreteFlyWeight extends AbstractFlyWeight {
    @Override
    public void operation(int storage) {
        System.out.println("共享空间" + storage);
    }
}
