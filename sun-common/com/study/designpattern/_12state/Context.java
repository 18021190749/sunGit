package com.study.designpattern._12state;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 15:13
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String stateMsg(){
        return this.state.getState();
    }
}
