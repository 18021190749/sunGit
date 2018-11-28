package com.study.designpattern._21mediator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 10:28
 */
public class Iraq extends Country{
    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }
    public void declare(String message) {
        unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得消息" + message);
    }
}
