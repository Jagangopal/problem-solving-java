package com.logical.problems.array;

import java.util.Arrays;

public class MoveZerosInArray {

    public int[] moveZerosCompute(int[] inputArray){
        int n = inputArray.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(inputArray[i] != 0)
                inputArray[count++] = inputArray[i];
        }
        while(count < n)
            inputArray[count++] = 0;

        return inputArray;
    }

    public static void main(String[] args){
        int[] inputArray = {0,1,0,3,1,2};
        MoveZerosInArray moveZerosInArray = new MoveZerosInArray();
        int[] result = moveZerosInArray.moveZerosCompute(inputArray);
        Arrays.stream(result).forEach(x -> System.out.println(x));
    }
}
