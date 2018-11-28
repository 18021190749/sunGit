package com.study.designpattern._9builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-15 18:37
 */
public class BuilderImpl implements Builder{

    private Product product;

    public BuilderImpl() {
        this.product = new Product();
    }

    @Override
    public void keyBoard() {
        product.setKeyBoard("keyboard");
    }

    @Override
    public void screen() {
        product.setScreen("screen");
    }

    @Override
    public void mouse() {
        product.setMouse("mouse");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
