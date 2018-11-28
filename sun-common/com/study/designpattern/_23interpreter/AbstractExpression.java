package com.study.designpattern._23interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:30
 */
public abstract class AbstractExpression {

    /**
     * 解释
     * @param context
     */
    public abstract void express(Context context);
}
