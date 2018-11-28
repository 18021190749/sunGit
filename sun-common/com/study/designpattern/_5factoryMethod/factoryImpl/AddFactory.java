package com.study.designpattern._5factoryMethod.factoryImpl;

import com.study.designpattern._5factoryMethod.Factory;
import com.study.designpattern._5factoryMethod.Operation;
import com.study.designpattern._5factoryMethod.OperationImpl.Add;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-28 11:20
 */
public class AddFactory implements Factory{
    private double a;
    private double b;

    public AddFactory() {
    }

    public AddFactory(double a, double b) {
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
        Map map=new HashMap();
    }

    @Override
    public Operation getOperation() {
        return new Add(this.a,this.b);
    }
}
