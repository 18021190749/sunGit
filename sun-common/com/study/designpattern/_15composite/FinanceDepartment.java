package com.study.designpattern._15composite;

import com.util.StringUtil;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-20 14:36
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int index) {
        System.out.println(StringUtil.oneMore("-", index) + this.name);
    }

    @Override
    public void onDuty() {
        System.out.println("财务管理" + this.name);
    }
}
