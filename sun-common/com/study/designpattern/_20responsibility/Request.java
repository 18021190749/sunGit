package com.study.designpattern._20responsibility;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 15:31
 */
public class Request {

    /**
     * reason : 生病
     * days : 3
     */

    private String reason;
    private int days;

    public Request(String reason, int days) {
        this.reason = reason;
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
