package com.study.designpattern._1simpleFactory;

import java.util.Scanner;

/**
 * ${DESCRIPTION}
 * 简单工厂模式
 * @author sunjie
 * @create 2018-07-25 17:35
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入优惠方式，1,2,3,");
        String type = scanner.nextLine();
        CashSuper cashSuper = CashFactory.createCash(type);
        System.out.println("请输入金额");
        double need = scanner.nextDouble();
        double pay = cashSuper.pay(need);
        System.out.println("需支付:"+pay+"元");
    }
}
