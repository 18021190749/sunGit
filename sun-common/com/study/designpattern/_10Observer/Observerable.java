package com.study.designpattern._10Observer;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-16 14:40
 */
public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
