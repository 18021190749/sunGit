package com.study.test.others;

/**
 * @Description
 * @Author sunjie
 * @Create 2018-11-14 15:08
 */
public interface Obserable {
    void addNotice(Observer observer);
    void removeNotice(Observer observer);
    void notice();
}
