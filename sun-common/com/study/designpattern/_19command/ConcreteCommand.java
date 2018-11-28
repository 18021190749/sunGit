package com.study.designpattern._19command;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 14:53
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
       receiver.action();
    }
}
