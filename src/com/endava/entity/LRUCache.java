package com.endava.entity;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by vcerbu on 3/28/2017.
 */
public class LRUCache {
    public static void main(String[] args) {
        LinkedHashMap<String, LocalDateTime> LRUMap = new LinkedHashMap<String, LocalDateTime>(50, 0.5f, false) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > 50;
            }
        };

        for (int i = 1; i <= 50; i++) {
            LRUMap.put("user"+i, LocalDateTime.now());
        }
        LRUMap.put("user51",LocalDateTime.now());
        LRUMap.put("user52",LocalDateTime.now());
        LRUMap.put("user53",LocalDateTime.now());
        LRUMap.put("user54",LocalDateTime.now());

        for (Map.Entry<String, LocalDateTime> l : LRUMap.entrySet()) {
            System.out.println(l.getKey());
        }
    }
}
