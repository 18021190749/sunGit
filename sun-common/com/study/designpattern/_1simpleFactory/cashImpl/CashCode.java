package com.study.designpattern._1simpleFactory.cashImpl;

import com.study.designpattern._1simpleFactory.CashSuper;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-25 17:18
 */
public class CashCode extends CashSuper {
    private double code = 1.0d;

    public CashCode(double code) {
        this.code = code;
    }

    @Override
    public double pay(double need) {
        return need * code;
    }
}
