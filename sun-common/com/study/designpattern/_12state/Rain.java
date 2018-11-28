package com.study.designpattern._12state;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 15:13
 */
public class Rain implements State{
    @Override
    public String getState() {
        return "雨天";
    }
}
