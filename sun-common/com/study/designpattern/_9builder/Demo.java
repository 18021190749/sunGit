package com.study.designpattern._9builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-15 18:41
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new BuilderImpl();
        director.buildProduct(b1);
        b1.buildProduct().show();

    }
}
