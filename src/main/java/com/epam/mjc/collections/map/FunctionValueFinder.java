package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return Objects.requireNonNull(functionMap).containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        return sourceList.stream().collect(Collectors.toMap(i -> i, i -> 5*i + 2));
    }

    /*public static void main(String[] args) {
        var obj = new FunctionValueFinder();
        var list = List.of(-1, 5, 4, 8);
        obj.calculateFunctionMap(list).entrySet().forEach(System.out::println);
        System.out.println(obj.isFunctionValuePresent(list, 26));
    }*/
}