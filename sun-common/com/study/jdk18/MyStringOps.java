package com.study.jdk18;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-15 21:01
 */
public class MyStringOps {
    public String strReverse1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
