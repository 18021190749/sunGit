package com.study.designpattern._11abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:15
 */
public abstract class Driver {
    public abstract BmwCar createBmwCar(String car) throws Exception;

    public abstract AudiCar createAudiCar(String car) throws Exception;
}
