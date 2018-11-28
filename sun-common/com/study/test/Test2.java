package com.study.test;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-09 19:35
 */
public class Test2 {

    public  static void main(String[] args){
        System.out.println(T2.a);
    }
}

class T2 {

    public static final String a = "ID";

    static {
        System.out.println("OK");
    }


}