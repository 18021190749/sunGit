package com.study.designpattern._14memento;

/**
 * ${DESCRIPTION}
 * 发起者角色:
 * @author sunjie
 * @create 2018-08-20 10:46
 */
public class Emp {
    private String name;
    private int age;
    private int salary;

    /**
     * 进行备份操作，并返回一个备忘录对象
     * @return
     */
    public EmpMemento memento(){
        return new EmpMemento(this.name,this.age,this.salary);
    }

    /**
     * 进行数据恢复，恢复成备忘录中对象的值
     * @param em
     */
    public void recovery(EmpMemento em){
        this.name=em.getName();
        this.age=em.getAge();
        this.salary=em.getSalary();
    }


    public Emp(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
