package com.study.designpattern._13adapter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 16:29
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻(){
        System.out.println(this.name+"外籍中锋进攻");
    }

    public void 防守(){
        System.out.println(this.name+"外籍中锋防守");
    }
}
