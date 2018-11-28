package com.study.designpattern._1simpleFactory.cashImpl;

import com.study.designpattern._1simpleFactory.CashSuper;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-25 17:25
 */
public class CashNomal extends CashSuper{
    @Override
    public double pay(double need) {
        return need;
    }
}
