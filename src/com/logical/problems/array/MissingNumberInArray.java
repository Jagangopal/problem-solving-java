package com.logical.problems.array;

import java.util.Arrays;

public class MissingNumberInArray {

    public int findMissingNumberInArray(int[] nums){
        int numlength = nums.length + 1;
        int expectedSum = numlength * (numlength + 1) / 2; //55
        int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum; //6
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,7,8,9,10};
        MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
        int result = missingNumberInArray.findMissingNumberInArray(nums);
        System.out.println("Missing number in an array is: "+ result);
    }
}
