package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        var swappedMap = new HashMap<String, Integer>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            var swappedKey = entry.getValue();
            var swappedValue = entry.getKey();
            if (swappedMap.containsKey(swappedKey)) {
                if (swappedValue < swappedMap.get(swappedKey)) {
                    swappedMap.put(swappedKey, swappedValue);
                }
            } else {
                swappedMap.put(swappedKey, swappedValue);
            }
        }

        return swappedMap;
    }

    /*public static void main(String[] args) {
        var obj = new KeyValueSwapper();
        Map<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(1, "one");
        sourceMap.put(2, "two");
        sourceMap.put(3, "three");
        sourceMap.put(10, "one");
        obj.swap(sourceMap).entrySet().forEach(System.out::println);
    }*/
}
