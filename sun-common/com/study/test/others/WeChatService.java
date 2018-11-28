package com.study.test.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author sunjie
 * @Create 2018-11-14 15:09
 */
public class WeChatService implements Obserable{
    private List<Observer> observers;
    private String message;

    public WeChatService() {
        this.observers = new ArrayList<>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
            observer.notice(this.message);
        });
    }
}
