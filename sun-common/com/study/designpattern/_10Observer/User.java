package com.study.designpattern._10Observer;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-16 14:50
 */
public class User implements Observer{
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
