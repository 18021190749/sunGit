package com.nosql;


import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-19 15:12
 */
public interface OrderRepository extends MongoRepository<Order,String> {
}
