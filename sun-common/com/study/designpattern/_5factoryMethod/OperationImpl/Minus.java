package com.study.designpattern._5factoryMethod.OperationImpl;

import com.study.designpattern._5factoryMethod.Operation;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-28 10:36
 */
public class Minus implements Operation {
    private double a;
    private double b;

    public Minus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double operate() {
        return this.a - this.b;
    }
}
