package com.study.designpattern._17singleton;

/**
 * ${DESCRIPTION}
 * 懒汉+双重锁校验
 *
 * 　
 *
 * 一旦一个共享变量（类的成员变量、类的静态成员变量）被volatile修饰之后，那么就具备了两层语义：

 　　1）保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。

 　　2）禁止进行指令重排序。

 volatile关键字禁止指令重排序有两层意思：

 　　1）当程序执行到volatile变量的读操作或者写操作时，在其前面的操作的更改肯定全部已经进行，且结果已经对后面的操作可见；
       在其后面的操作肯定还没有进行；

 　　2）在进行指令优化时，不能将在对volatile变量访问的语句放在其后面执行，也不能把volatile变量后面的语句放到其前面执行。
 https://www.cnblogs.com/dolphin0520/p/3920373.html
 * @author sunjie
 * @create 2018-08-20 19:13
 */
public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
