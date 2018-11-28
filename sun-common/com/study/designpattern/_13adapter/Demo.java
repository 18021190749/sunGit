package com.study.designpattern._13adapter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 16:35
 */
public class Demo {
    public static void main(String[] args) {
        Player a = new Forward("A");
        a.go();
        Player b = new Translator("B");
        b.go();
    }
}
