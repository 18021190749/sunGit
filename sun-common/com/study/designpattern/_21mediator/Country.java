package com.study.designpattern._21mediator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 10:21
 */
public abstract class Country {
    public UnitedNations unitedNations;

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }
}
