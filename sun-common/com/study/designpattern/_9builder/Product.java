package com.study.designpattern._9builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-15 18:33
 */
public class Product {
    private String keyBoard;
    private String screen;
    private String mouse;

    public Product() {
    }

    public Product(String keyBoard, String screen, String mouse) {

        this.keyBoard = keyBoard;
        this.screen = screen;
        this.mouse = mouse;
    }

    public String getKeyBoard() {

        return keyBoard;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void show() {
        System.out.println(this.keyBoard + this.screen + this.mouse);
    }
}
