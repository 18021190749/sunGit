package com.study.designpattern._11abstractFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-17 15:27
 */
public class Demo {
    public static Properties properties = new Properties();
    static{
        try {
            properties.load(new FileReader("E:\\sunDemo\\sun-common\\com\\study\\designpattern\\_11abstractFactory\\config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        Driver driver = new SportDriver();
        AudiCar audiCar = driver.createAudiCar("奥迪");
        audiCar.drive();

        Driver driver1 = new SuvCar();
        BmwCar bmwCar = driver1.createBmwCar("宝马");
        bmwCar.drive();

        ReflexDriver reflexDriver = new ReflexDriver();
        BmwCar bmwCar1 = reflexDriver.createBmwCar("com.study.designpattern._11abstractFactory.Bmw.BmwSportCar");
        bmwCar1.setName("宝马");
        bmwCar1.drive();
        reflexDriver.createAudiCar("com.study.designpattern._11abstractFactory.Audi.AudiSuvcar").drive();

        System.out.println(getValue("className"));
        System.out.println(getValue("carName"));


    }

    public static String getValue(String key){
        return (String)properties.get(key);
    }
}
