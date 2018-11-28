package com.study.designpattern._21mediator;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 10:32
 */
public class ConcreteUS extends UnitedNations{
    private USA usa;
    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country country) {
        if(usa == country){
            iraq.getMessage(message);
        }else{
            usa.getMessage(message);
        }
    }
}
