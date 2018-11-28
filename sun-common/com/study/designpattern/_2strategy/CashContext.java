package com.study.designpattern._2strategy;

import com.study.designpattern._1simpleFactory.CashSuper;
import com.study.designpattern._1simpleFactory.cashImpl.CashCode;
import com.study.designpattern._1simpleFactory.cashImpl.CashNomal;
import com.study.designpattern._1simpleFactory.cashImpl.CashReturn;

/**
 * ${DESCRIPTION}-
 *
 * @author sunjie
 * @create 2018-07-25 19:56
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public CashContext(String type){
        switch (type){
            case "原价":
                this.cashSuper=new CashNomal();
                break;
            case "满100":
                this.cashSuper=new CashReturn(100,30);
                break;
            case "满200":
                this.cashSuper=new CashReturn(200,70);
                break;
            case "9折":
                this.cashSuper=new CashCode(0.9);
                break;
            default:
                this.cashSuper=new CashNomal();
                break;
        }
    }

    public double getResult(double need){
        return cashSuper.pay(need);
    }
}
