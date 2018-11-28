package com.study.designpattern._11abstractFactory.Audi;

import com.study.designpattern._11abstractFactory.AudiCar;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:02
 */
public class AudiSportCar extends AudiCar{
    @Override
    public void drive() {
        System.out.println(this.getName()+"奥迪跑车");
    }
}
