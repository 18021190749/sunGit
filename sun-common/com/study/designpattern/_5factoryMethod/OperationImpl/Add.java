package com.study.designpattern._5factoryMethod.OperationImpl;

import com.study.designpattern._5factoryMethod.Operation;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-28 10:03
 */
public class Add implements Operation {

    private double a;
    private double b;

    public Add(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double operate() {
        return this.a + this.b;
    }
}
