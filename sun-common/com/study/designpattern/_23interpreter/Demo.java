package com.study.designpattern._23interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:37
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        AbstractExpression a = new Doc();
        AbstractExpression b = new Xlsx();
        AbstractExpression c = new Doc();
        a.express(context);
        b.express(context);
        c.express(context);
    }
}
