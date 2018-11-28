package com.study.designpattern._22flyweight;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:13
 */
public class Demo {
    public static void main(String[] args) {
        int storage = 10;
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        AbstractFlyWeight f1 = flyWeightFactory.getFlyWeights("1");
        f1.operation(storage);
        AbstractFlyWeight f2 = flyWeightFactory.getFlyWeights("2");
        f2.operation(storage);
        AbstractFlyWeight f3 = flyWeightFactory.getFlyWeights("3");
        f3.operation(storage);
    }
}
