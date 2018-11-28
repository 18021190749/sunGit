package com.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-11 18:37
 */
public class Test {

    public static void main(String[] args) {
        //
        //String regex = "_23";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher("c_23_122131321_id");
        //if (matcher.find()){
        //System.out.println(matcher.groupCount());
        //System.out.println(matcher.group());
        //}
        //String input = "t_id";
        //System.out.println(input.substring(0,input.indexOf("_id")+1)+"602"+"_id");
        //
        String data = "{\"a\":1,\"b\":\"b\",\"c\":\"Sep 25, 2018 7:19:31 PM\",\"d\":,\"e\":\"\"}";
        Gson gson = new GsonBuilder().serializeNulls().create();
        Map map1 = gson.fromJson(data,Map.class);
        System.out.println(map1.toString());
        Map<String,Object> map = new HashMap<>();
        map.put("a",1);
        map.put("b","b");
        map.put("c",new Date());
        map.put("d",null);
        map.put("e","");
        System.out.println(gson.toJson(map));
    }

}
