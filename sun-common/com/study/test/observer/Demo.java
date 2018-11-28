package com.study.test.observer;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-07 9:57
 */
public class Demo {
    public static void main(String[] args) {
        NoticeService service = new NoticeService();
        User a = new User("A");
        User b = new User("B");
        User c = new User("C");
        service.addNotice(a);
        service.addNotice(b);
        service.addNotice(c);
        service.setMessage("Hello World！");
        System.out.println("------------");
        service.removeNotice(a);
        service.setMessage("sorry");
    }
}
