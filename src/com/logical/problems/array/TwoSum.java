package com.logical.problems.array;

public class TwoSum {

    public int[] calculateTwoSum(int[] inputArray, int target){
        int low = 0, high = inputArray.length -1;
        while(low < high){
            int sum = inputArray[low] + inputArray[high];
            if(sum == target)
                return new int[]{low, high};
            if(sum > target)
                high--;
            else
                low++;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] inputArray = {2,7,11,15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.calculateTwoSum(inputArray, 18);
        for (int i : result) {
            System.out.print(i);
        }
    }
}
