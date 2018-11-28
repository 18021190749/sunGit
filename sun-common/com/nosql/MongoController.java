package com.nosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-19 15:35
 */
@Controller
@RequestMapping("mongo")
public class MongoController {
    @Autowired
    MongoDemo mongoDemo;

    @RequestMapping("demo")
    public void demo() {
        mongoDemo.coutNum();
    }
}
