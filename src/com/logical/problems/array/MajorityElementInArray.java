package com.logical.problems.array;

public class MajorityElementInArray {

    public int calculateMajorityElement(int[] inputArray){
        int count = 0, candidate = inputArray[0];
        for(int value: inputArray){
            if(count == 0){
                candidate = inputArray[0];
            }
            count += (value == candidate) ? 1: -1;
        }
        return candidate;
    }

    public static void main(String[] args){
        int[] inputArray = {1,4,4,1,1,1,2,3,4,4,5,5,1};
        MajorityElementInArray majorityElementInArray = new MajorityElementInArray();
        int result = majorityElementInArray.calculateMajorityElement(inputArray);
        System.out.println(result);
    }
}
