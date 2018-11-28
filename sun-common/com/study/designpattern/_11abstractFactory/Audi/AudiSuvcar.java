package com.study.designpattern._11abstractFactory.Audi;

import com.study.designpattern._11abstractFactory.AudiCar;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:05
 */
public class AudiSuvcar extends AudiCar{
    @Override
    public void drive() {
        System.out.println(this.getName()+"奥迪SUV");
    }
}
