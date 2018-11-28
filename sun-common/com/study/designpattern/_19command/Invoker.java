package com.study.designpattern._19command;

import lombok.Setter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 14:40
 */
public class Invoker {
    private @Setter Command command;
    public void executeCommand(){
        command.execute();
    }
}
