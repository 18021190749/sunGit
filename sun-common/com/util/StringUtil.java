package com.util;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-20 14:23
 */
public class StringUtil {
    /**
     * lPad("-",2)  --->>>   "--"
     *
     * @param filler
     * @param index
     * @return
     */
    public static String oneMore(String filler, int index) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (index > 0) {
            for(int i =0 ;i<index;i++){
                stringBuilder.append(filler);
            }
        }
        return stringBuilder.toString();
    }
}
