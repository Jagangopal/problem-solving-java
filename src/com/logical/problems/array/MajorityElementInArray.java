package com.logical.problems.array;

public class MajorityElementInArray {

    public int calculateMajorityElement(int[] inputArray){
        int candidate = inputArray[0];
        int count = 1;
        int maxCount = 0, maxCandidate = 0;
        for(int i = 1; i < inputArray.length; i++){
            count += (inputArray[i] == candidate)? 1: -1;

            if(count == 0)
                candidate = inputArray[i];

            if(count > maxCount){
                maxCount = count;
                maxCandidate = candidate;
            }
        }
        return maxCandidate;
    }

    public static void main(String[] args){
        int[] inputArray = {1,4,4,1,1,1,2,3,4,4,5,5,1};
        MajorityElementInArray majorityElementInArray = new MajorityElementInArray();
        int result = majorityElementInArray.calculateMajorityElement(inputArray);
        System.out.println(result);
    }
}
