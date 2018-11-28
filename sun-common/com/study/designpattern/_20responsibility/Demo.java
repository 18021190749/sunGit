package com.study.designpattern._20responsibility;

import com.study.designpattern._20responsibility.leader.Boss;
import com.study.designpattern._20responsibility.leader.Charger;
import com.study.designpattern._20responsibility.leader.GeneralManager;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 16:07
 */
public class Demo {
    public static void main(String[] args) {
        Request request = new Request("生病",10);
        Handler handler = new Charger();
        Handler handler1 = new GeneralManager();
        Handler handler2 = new Boss();
        handler.setHandler(handler1);
        handler1.setHandler(handler2);
        handler.handleRequest(request);
    }
}
