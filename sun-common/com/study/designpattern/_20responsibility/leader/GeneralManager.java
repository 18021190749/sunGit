package com.study.designpattern._20responsibility.leader;

import com.study.designpattern._20responsibility.Handler;
import com.study.designpattern._20responsibility.Request;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 15:38
 */
public class GeneralManager extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getDays() <= MANAGER) {
            System.out.println("总经理批准");
        }else{
            handler.handleRequest(request);
        }
    }
}
