package com.study.redis.DataTypeDemo;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-10 15:58
 */
public class ListDemo {
    public String demo(Jedis jedis) {
        //存储数据到列表中
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("tutorial-list", 0, 5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return null;
    }
}
