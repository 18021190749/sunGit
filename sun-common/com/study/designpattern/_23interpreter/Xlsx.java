package com.study.designpattern._23interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:36
 */
public class Xlsx extends AbstractExpression{
    @Override
    public void express(Context context) {
        System.out.println("xlsx");
    }
}
