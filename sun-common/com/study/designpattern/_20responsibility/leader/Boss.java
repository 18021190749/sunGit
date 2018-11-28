package com.study.designpattern._20responsibility.leader;

import com.study.designpattern._20responsibility.Handler;
import com.study.designpattern._20responsibility.Request;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 15:31
 */
public class Boss extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getDays() > BOSS) {
            System.out.println("滚蛋");
        } else {
            System.out.println("同意");
        }
    }
}
