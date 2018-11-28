package com.study.designpattern._23interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:34
 */
public class Doc extends AbstractExpression{
    @Override
    public void express(Context context) {
        System.out.println("doc");
    }
}
