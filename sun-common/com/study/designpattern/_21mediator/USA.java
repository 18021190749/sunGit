package com.study.designpattern._21mediator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 10:25
 */
public class USA extends Country {
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message) {
        unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得消息" + message);
    }
}
