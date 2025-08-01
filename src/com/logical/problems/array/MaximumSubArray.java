package com.logical.problems.array;

public class MaximumSubArray {

    public int calculateMaximumSubArray(int[] arrayInput){
        int current = arrayInput[0], max = arrayInput[0];
        for(int i = 1; i < arrayInput.length; i++){
            current = Math.max(arrayInput[i] + current, arrayInput[i]);
            max = Math.max(current, max);
        }
        return max;
    }

    public static void main(String[] args){
        int[] arrayInput = {2,3,-8,7,-1,2,3};
        int[] arrayInputTwo = {-2,-4};
        int[] arrayInputThree = {5,4,1,7,8};
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int result = maximumSubArray.calculateMaximumSubArray(arrayInput);
        System.out.println(result);
    }
}
