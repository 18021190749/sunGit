package com.study.test;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-09 19:28
 */
public class Test1 {

    public static  void main(String[] args){
        System.out.println(B.c);
    }


}
class A{
    public static String c="C";
    static {
        System.out.println("A");
    }
}

class B extends A{
    static {
        System.out.println("B");
    }
}