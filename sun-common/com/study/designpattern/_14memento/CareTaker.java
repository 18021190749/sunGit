package com.study.designpattern._14memento;

/**
 * ${DESCRIPTION}
 * 管理者角色：负责管理备忘录类，示例只保存了一个备忘录对象，可以通过设置栈保存多个对象
 * @author sunjie
 * @create 2018-08-20 10:51
 */
public class CareTaker {
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
