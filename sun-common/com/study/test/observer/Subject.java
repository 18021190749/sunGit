package com.study.test.observer;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-07 9:49
 */
public interface Subject {
    void addNotice(Observer observer);
    void removeNotice(Observer observer);
    void notice();
}
