package com.study.designpattern._19command;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 14:20
 */
public abstract class Command {
    public Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 命令执行
     */
    public abstract void execute();
}
