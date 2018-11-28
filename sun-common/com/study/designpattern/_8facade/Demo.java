package com.study.designpattern._8facade;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-15 16:11
 */
public class Demo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operateA();
        facade.operateB();
    }
}
