package com.study.designpattern._17singleton;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-21 14:47
 */
public enum Season {
    SPRING("春天"),SUMMER("夏天"),FALL("秋天"),WINTER("冬天");
    private final String name;

    private Season(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
