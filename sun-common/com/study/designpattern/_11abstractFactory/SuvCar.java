package com.study.designpattern._11abstractFactory;

import com.study.designpattern._11abstractFactory.Audi.AudiSuvcar;
import com.study.designpattern._11abstractFactory.Bmw.BmwSuvCar;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:26
 */
public class SuvCar extends Driver{
    @Override
    public BmwCar createBmwCar(String car) throws Exception {
        BmwCar bmwCar = new BmwSuvCar();
        bmwCar.setName(car);
        return bmwCar;
    }

    @Override
    public AudiCar createAudiCar(String car) throws Exception {
        AudiCar audiCar = new AudiSuvcar();
        audiCar.setName(car);
        return audiCar;
    }
}
