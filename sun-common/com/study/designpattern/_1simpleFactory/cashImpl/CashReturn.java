package com.study.designpattern._1simpleFactory.cashImpl;

import com.study.designpattern._1simpleFactory.CashSuper;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-25 17:13
 */
public class CashReturn extends CashSuper {

    private double cashCondition = 0.0d;
    private double cashReturn = 0.0d;

    public CashReturn(double cashCondition, double cashReturn) {
        this.cashCondition = cashCondition;
        this.cashReturn = cashReturn;
    }

    @Override
    public double pay(double need) {
        if (need >= cashCondition) {
            return need - cashReturn;
        }
        return need;
    }
}
