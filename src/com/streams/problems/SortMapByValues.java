package com.streams.problems;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValues {

    public void sortMapByValuesComparator(Map<String, Integer> inputMap){
       List<Map.Entry<String, Integer>> listMap = new ArrayList<>(inputMap.entrySet());
        Collections.sort(listMap, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> keyValue: listMap){
            resultMap.put(keyValue.getKey(), keyValue.getValue());
        }
        System.out.println(resultMap);
    }

    public void sortMapStreamSolution(Map<String, Integer> inputMap){
        Map<String, Integer> sortedByValuesMap = inputMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k, v) -> k, LinkedHashMap::new));
        System.out.println(sortedByValuesMap);
    }
    public static void main(String[] args){
        SortMapByValues sortMapByValues = new SortMapByValues();
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("Math", 98);
        inputMap.put("Data Structure", 85);
        inputMap.put("Database", 91);
        inputMap.put("Java", 95);
        inputMap.put("Operating System", 79);
        inputMap.put("Networking", 80);
        sortMapByValues.sortMapByValuesComparator(inputMap);
        //sortMapByValues.sortMapStreamSolution(inputMap);
    }
}
