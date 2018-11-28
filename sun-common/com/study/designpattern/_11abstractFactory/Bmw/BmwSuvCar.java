package com.study.designpattern._11abstractFactory.Bmw;

import com.study.designpattern._11abstractFactory.BmwCar;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:06
 */
public class BmwSuvCar extends BmwCar{
    @Override
    public void drive() {
        System.out.println(this.getName()+"宝马SUV");
    }
}
