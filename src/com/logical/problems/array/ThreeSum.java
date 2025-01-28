package com.logical.problems.array;

import java.util.Arrays;

public class ThreeSum {
    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     * @param inputArray
     * @param target
     * @return
     */
    public boolean calculateThreeSum(int[] inputArray, int target){
        int n = inputArray.length;
        Arrays.sort(inputArray);
        for(int i = 0; i < n; i++){
            int l = i + 1, r = n -1;
            int requiredSum = target - inputArray[i];
            while(l < r){
                int tempValue = inputArray[l] + inputArray[r];
                if(tempValue == requiredSum) return true;
                if(tempValue > requiredSum) r--;
                else if(tempValue < requiredSum) l++;
            }
        }

        return false;
    }

    public static void main(String[] args){
        ThreeSum threeSum = new ThreeSum();
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        if (threeSum.calculateThreeSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
