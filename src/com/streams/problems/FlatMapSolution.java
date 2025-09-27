package com.streams.problems;

import java.util.Arrays;
import java.util.List;

public class FlatMapSolution {
    public void performFlatMapOperation(){
        List<List<Integer>> listOfList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> resultList = listOfList
                .stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println(resultList.toString());
    }
    public static void main(String[] args){
        FlatMapSolution flatMapSolution = new FlatMapSolution();
        flatMapSolution.performFlatMapOperation();
    }
}
