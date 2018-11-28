package com.study.designpattern._8facade;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-15 16:04
 */
public class Facade {
    private Windows windows;
    private Linux linux;

    public Facade() {
        this.windows = new Windows();
        this.linux = new Linux();
    }

    public void operateA(){
        windows.operate();
    }

    public void operateB(){
        windows.operate();
        linux.operate();
    }
}
