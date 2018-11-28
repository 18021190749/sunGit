package com.study.designpattern._1simpleFactory;

import com.study.designpattern._1simpleFactory.cashImpl.CashCode;
import com.study.designpattern._1simpleFactory.cashImpl.CashNomal;
import com.study.designpattern._1simpleFactory.cashImpl.CashReturn;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-25 17:26
 */
public class CashFactory {
    public static CashSuper createCash(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "1":
                cashSuper = new CashNomal();
                break;
            case "2":
                cashSuper = new CashReturn(500, 200);
                break;
            case "3":
                cashSuper = new CashCode(0.9);
        }
        return cashSuper;
    }
}
