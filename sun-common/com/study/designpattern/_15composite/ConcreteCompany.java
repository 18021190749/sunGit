package com.study.designpattern._15composite;

import com.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-20 14:19
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int index) {
        System.out.println(StringUtil.oneMore("-", index) + this.name);
        children.forEach(child -> {
            child.display(index + 2);
        });
    }

    @Override
    public void onDuty() {
        children.forEach(child->{
            child.onDuty();
        });
    }
}
