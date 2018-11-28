package com.study.jdk18;

import java.util.function.Predicate;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-11 18:11
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(1));
        System.out.println(predicate.test(6));
    }
}
