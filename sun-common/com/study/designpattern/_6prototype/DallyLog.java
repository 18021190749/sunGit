package com.study.designpattern._6prototype;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-28 12:41
 */
public class DallyLog implements Cloneable{
    private String name;
    private String date;
    private String context;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public DallyLog clone(){
        return this.clone();
    }
}
