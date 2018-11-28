package com.study.designpattern._18bridge;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 11:31
 */
public class Demo {
    public static void main(String[] args) {
        MobileBrand nokia = new Nokia();
        nokia.setAppSoft(new AddressList());
        nokia.run();
        nokia.setAppSoft(new MobileGame());
        nokia.run();
        MobileBrand apple = new Apple();
        apple.setAppSoft(new MobileGame());
        apple.run();
    }
}
