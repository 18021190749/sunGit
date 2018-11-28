package com.study.jdk18;

import java.util.Optional;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-11 16:45
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional= Optional.of("sunjie");
        optional.ifPresent(s -> System.out.println(s));
        optional.map(o->o.toUpperCase()).orElse("孙杰");
        System.out.println(optional.map(o->o.toUpperCase()).orElse("孙杰"));
        System.out.println(optional.filter(o->o.substring(1,2).equals("u")).orElse("SUNJIE"));

        Optional optional1 = Optional.ofNullable(null);
        System.out.println( optional1.orElseGet(()->"else"));
    }
}
