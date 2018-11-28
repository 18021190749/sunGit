package com.study.test.observer;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-07 9:53
 */
public class User implements Observer {
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
        System.out.println(name + "收到服务器发送消息：" + message);
    }
}
