package com.streams.problems;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class MapStreamSolution {

    public void performMapOperation(){
        List<String> listOfString = Arrays.asList("1","2","3");
        List<Integer> listOfInteger = listOfString
                .stream()
                .map(Integer::valueOf)
                .toList();
        System.out.print(listOfString.toString());
        System.out.print(listOfInteger.toString());
    }
    public static void main(String[] args){
        MapStreamSolution mapStreamSolution = new MapStreamSolution();
        mapStreamSolution.performMapOperation();
    }
}
