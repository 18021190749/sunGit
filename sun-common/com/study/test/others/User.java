package com.study.test.others;

/**
 * @Description
 * @Author sunjie
 * @Create 2018-11-14 15:09
 */
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notice(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}
