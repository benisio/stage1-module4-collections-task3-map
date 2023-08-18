package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        var resultMap = new HashMap<String, Integer>();
        var sentenceTokenizer = new StringTokenizer(sentence, " ");
        while (sentenceTokenizer.hasMoreTokens()) {
            var key = sentenceTokenizer.nextToken().toLowerCase();
            if (resultMap.containsKey(key)) {
                var oldValue = resultMap.get(key);
                resultMap.replace(key, oldValue, ++oldValue);
            } else {
                resultMap.put(key, 1);
            }
        }
        return resultMap;
    }

    /*public static void main(String[] args) {
        var obj = new WordRepetitionMapCreator();
        System.out.println(obj.createWordRepetitionMap("sentence in loWER caSE SENTENCE IN UPper CAse"));
    }*/
}
