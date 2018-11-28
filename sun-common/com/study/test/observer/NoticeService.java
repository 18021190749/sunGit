package com.study.test.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-07 9:51
 */
public class NoticeService implements Subject{
    private String message;
    private List<Observer> observers;

    public NoticeService() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addNotice(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeNotice(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice() {
        observers.forEach(observer -> {
            observer.update(message);
        });
    }

    public void setMessage(String message) {
        this.message = message;
        notice();
    }
}
