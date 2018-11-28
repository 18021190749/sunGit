package com.util;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.javafx.geom.Point2D;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-05-19 14:10
 */
public class test {
    public static void main(String[] args) {
        String aa = null;
        System.out.println(aa.toString());
        Integer page = 3;
        Integer limit = 10;
        Integer start = (page-1) * limit + 1;
        Integer end = start + limit - 1;
        System.out.println(start+" :"+end);
        String param = "{\n" +
                "\t\"type\": \"1\",\n" +
                "\t\"name\": \"jack\"\n" +
                "}";
        Map ret = gson.fromJson("",Map.class);
        System.out.println(ret);
       /* Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map =  notNUll(map,"2","2.2");
        map= notNUll(map,"4","4");
        System.out.println(map);*/
    }

    public static Map<String,String> notNUll(Map<String,String> map,String key,String value){
        if(Strings.isNullOrEmpty(map.get(key)))
            map.put(key,value);
        return map;
    }
    private static Gson gson=new GsonBuilder().serializeNulls().create();
}
