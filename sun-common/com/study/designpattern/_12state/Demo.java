package com.study.designpattern._12state;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 15:15
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new Rain());
        System.out.println(context.stateMsg());
        context.setState(new Sunshine());
        System.out.println(context.stateMsg());
    }
}
