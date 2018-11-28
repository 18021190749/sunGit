package com.study.designpattern._11abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:54
 */
public class ReflexDriver {

    public BmwCar createBmwCar(String car) throws Exception {
        return (BmwCar) Class.forName(car).newInstance();
    }

    public AudiCar createAudiCar(String car) throws Exception {
        return (AudiCar) Class.forName(car).newInstance();
    }
}
