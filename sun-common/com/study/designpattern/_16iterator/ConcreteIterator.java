package com.study.designpattern._16iterator;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-20 16:01
 */
public class ConcreteIterator implements Iterator {
    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public Boolean hasNext() {
        if (index >= list.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }
}
