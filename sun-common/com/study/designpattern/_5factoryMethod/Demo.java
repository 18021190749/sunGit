package com.study.designpattern._5factoryMethod;

import com.study.designpattern._5factoryMethod.factoryImpl.AddFactory;
import com.study.designpattern._5factoryMethod.factoryImpl.MinusFactory;

/**
 * ${DESCRIPTION}
 * 工厂方法
 * @author sunjie
 * @create 2018-07-28 9:52
 */
public class Demo {
    public static void main(String[] args) {
        AddFactory add = new AddFactory(2,3);
        System.out.println(add.getOperation().operate());
        MinusFactory minus = new MinusFactory();
        minus.setA(2);
        minus.setB(3);
        System.out.println(minus.getOperation().operate());
    }
}
