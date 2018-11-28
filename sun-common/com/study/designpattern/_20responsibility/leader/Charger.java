package com.study.designpattern._20responsibility.leader;

import com.study.designpattern._20responsibility.Handler;
import com.study.designpattern._20responsibility.Request;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 15:44
 */
public class Charger extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getDays() <= CHARGE) {
            System.out.println("主管同意");
        }else{
            handler.handleRequest(request);
        }
    }
}
