package com.study.lamda;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-08 16:33
 */
public class Params {
    public static String compose(String a, int... params) {
        int sum = 0;
        for (int i : params) {
            sum = sum + i;
        }
        return a + sum;
    }

    public static void main(String[] args) {
        System.out.println(compose("a", 1, 2, 3, 4, 5, 6, 7));
    }
}
