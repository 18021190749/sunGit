package com.study.designpattern._9builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-15 18:35
 */
public interface Builder {
    void keyBoard();
    void screen();
    void mouse();
    Product buildProduct();
}
