package com.study.designpattern._22flyweight;

import java.util.HashMap;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-23 14:08
 */
public class FlyWeightFactory {
    private HashMap<String, AbstractFlyWeight> flyWeights = new HashMap();

    public FlyWeightFactory() {
        flyWeights.put("1", new ConcreteFlyWeight());
        flyWeights.put("2", new ConcreteFlyWeight());
        flyWeights.put("3", new ConcreteFlyWeight());
    }

    public AbstractFlyWeight getFlyWeights(String key) {
        return flyWeights.get(key);
    }
}
