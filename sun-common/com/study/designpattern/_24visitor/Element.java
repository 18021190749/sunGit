package com.study.designpattern._24visitor;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 15:45
 */
public abstract class Element {
    /**
     * 接收访问者
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
