package com.streams.problems;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class MapStreamSolution {

    public void performMapOperation(){
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> resList = listOfStrings
                .stream()
                .map(Integer::valueOf)
                .toList();
        System.out.println(resList);
    }
    public static void main(String[] args){
        MapStreamSolution mapStreamSolution = new MapStreamSolution();
        mapStreamSolution.performMapOperation();
    }
}
