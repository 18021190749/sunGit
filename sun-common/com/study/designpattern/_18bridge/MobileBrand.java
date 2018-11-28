package com.study.designpattern._18bridge;

import lombok.Setter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-22 11:27
 */
public abstract class MobileBrand {
    public @Setter AppSoft appSoft;

    public abstract void run();
}
