package com.study.designpattern._2strategy;

import com.study.designpattern._1simpleFactory.cashImpl.CashCode;
import com.study.designpattern._1simpleFactory.cashImpl.CashNomal;
import com.study.designpattern._1simpleFactory.cashImpl.CashReturn;

/**
 * ${DESCRIPTION}
 * 策略模式
 *
 * @author sunjie
 * @create 2018-07-25 19:29
 */
public class Demo {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext(new CashNomal());
        CashContext cashContext2 = new CashContext(new CashReturn(100, 20));
        CashContext cashContext3 = new CashContext(new CashCode(0.8));
        System.out.println(cashContext.getResult(100));
        System.out.println(cashContext2.getResult(100));
        System.out.println(cashContext3.getResult(100));

        CashContext c1 = new CashContext("9折");
        System.out.println(c1.getResult(300));
    }
}
