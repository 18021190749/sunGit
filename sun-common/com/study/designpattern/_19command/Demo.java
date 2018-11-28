package com.study.designpattern._19command;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 14:54
 */
public class Demo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
