package com.study.designpattern._11abstractFactory;

import com.study.designpattern._11abstractFactory.Audi.AudiSportCar;
import com.study.designpattern._11abstractFactory.Bmw.BmwSportCar;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 22:35
 */
public class SportDriver extends Driver{

    @Override
    public BmwCar createBmwCar(String car) throws Exception {
        BmwCar bmwCar = new BmwSportCar();
        bmwCar.setName(car);
        return bmwCar;
    }

    @Override
    public AudiCar createAudiCar(String car) throws Exception {
        AudiCar audiCar = new AudiSportCar();
        audiCar.setName(car);
        return audiCar;
    }
}
