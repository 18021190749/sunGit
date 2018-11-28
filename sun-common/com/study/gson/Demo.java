package com.study.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-31 9:07
 */
public class Demo {
    public static void main(String[] args) {
        Gson gson1 = new GsonBuilder().serializeNulls().create();
        Map<String,Object> map = new HashMap<>();
        map.put("name",null);
        map.put("birthday",new Date());
        map.put("age",20);

        map.put("test","123123");
        Gson gson = new Gson();

        People p = gson.fromJson(gson.toJson(map),People.class);
        p.setGmtTime("123123");
        p.setItemId("123123");
        System.out.println(gson1.toJson(p));
    }
}
