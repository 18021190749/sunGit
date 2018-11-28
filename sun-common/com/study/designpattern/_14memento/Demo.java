package com.study.designpattern._14memento;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-20 10:52
 */
public class Demo {
    public static void main(String[] args) {
        CareTaker taker=new CareTaker();

        Emp emp=new Emp("张三",18,2000);
        System.out.println("第一次打印对象："+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

        taker.setMemento(emp.memento());//进行备忘

        emp.setAge(20);
        emp.setSalary(3000);
        System.out.println("第二次打印对象："+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

        emp.recovery(taker.getMemento());//数据恢复
        System.out.println("第三次打印对象："+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

    }
}
