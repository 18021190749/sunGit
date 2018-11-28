package com.study.test;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-09 19:44
 */
public class Test3 {


    public static void main(String[] args) {
        // 连接到 mongodb 服务
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        // 连接到数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("local");
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "10", "2", "3", "4", "5", "6", "7");
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) > Integer.parseInt(o2) ? 1 : -1;
            }
        });
        System.out.println(list);

        List a = Arrays.asList(new int[]{1,2,3,4});
        List b = Arrays.asList(new int[]{3,4,5,6});
        a.retainAll(b);
    }

}

