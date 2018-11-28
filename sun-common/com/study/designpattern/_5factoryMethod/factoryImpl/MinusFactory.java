package com.study.designpattern._5factoryMethod.factoryImpl;

import com.study.designpattern._5factoryMethod.Factory;
import com.study.designpattern._5factoryMethod.Operation;
import com.study.designpattern._5factoryMethod.OperationImpl.Minus;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-28 11:39
 */
public class MinusFactory implements Factory {
    private double a;
    private double b;

    public MinusFactory() {
    }

    public MinusFactory(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public Operation getOperation() {
        return new Minus(this.a, this.b);
    }
}
