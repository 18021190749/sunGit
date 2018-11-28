package com.study.designpattern._20responsibility;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 15:27
 */
public abstract class Handler {
    public Integer CHARGE = 1;
    public Integer MANAGER = 3;
    public Integer BOSS = 30;

    public Handler handler;

    /**
     * 设置下个操作者
     * @param handler
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * 处理请求
     * @param request
     */
    public abstract void handleRequest(Request request);
}
