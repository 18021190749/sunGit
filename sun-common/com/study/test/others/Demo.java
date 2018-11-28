package com.study.test.others;

/**
 * @Description
 * @Author sunjie
 * @Create 2018-11-14 15:45
 */
public class Demo {
    public static void main(String[] args) {
        User a = new User("a");
        User b = new User("b");
        User c = new User("c");
        WeChatService weChatService = new WeChatService();
        weChatService.setMessage("hello world!");
        weChatService.addNotice(a);
        weChatService.addNotice(b);
        weChatService.addNotice(c);
        weChatService.notice();
        weChatService.setMessage("第一次发消息！");
        weChatService.removeNotice(a);
        weChatService.notice();
    }
}
