package com.study.designpattern._11abstractFactory.Bmw;

import com.study.designpattern._11abstractFactory.BmwCar;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:07
 */
public class BmwSportCar extends BmwCar{
    @Override
    public void drive() {
        System.out.println(this.getName()+"宝马跑车");
    }
}
