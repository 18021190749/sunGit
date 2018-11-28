package com.study.redis.DataTypeDemo;

import redis.clients.jedis.Jedis;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-10 15:56
 */
public class StringDemo {
    public String demo(Jedis jedis){
        jedis.set("key","value");
        return jedis.get("key");
    }
}
