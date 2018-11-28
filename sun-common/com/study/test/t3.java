package com.study.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-04 20:14
 */
public class t3 {
    public void test() {

    }

    public class MyMap {
        int size = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Long> times = new HashMap<>();

        public int get(int key) {
            Integer value = map.get(key);
            if(value != null) {
                times.put(key, times.get(key)+1);
                return value;
            }
            else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if(map.size() >= size) {
                removeLeast();
            }
            times.put(key, 0L);
            map.put(key, value);
        }

        private void removeLeast() {
            if(map.size() == 0) {
                return;
            }

            Map.Entry<Integer, Long> min = null;
            for(Map.Entry<Integer, Long> entry : new HashSet<>(times.entrySet())) {
                if(min == null) {
                    min = entry;
                }
                else if(entry.getValue() < min.getValue()) {
                    min = entry;
                }
            }
            map.remove(min.getKey());
            times.remove(min.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
