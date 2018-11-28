package com.nosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-19 14:30
 */
@Service
public class MongoDemo {
    @Autowired
    MongoOperations mogo;

    public void coutNum() {
        Order order = initOrder();
        mogo.save(order, "order");
        long count = mogo.getCollection("order").count();
        System.out.println(count);
    }

    public Order initOrder() {
        Order order = new Order();
        order.setId("1");
        order.setCustomer("customer");
        order.setType("type");
        Item item = new Item();
        item.setId(1123L);
        item.setPrice(123.123);
        item.setProduct("product");
        item.setQuantity(11);
        item.setOrder(order);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(item);
        order.setItems(linkedHashSet);
        return order;
    }
}
