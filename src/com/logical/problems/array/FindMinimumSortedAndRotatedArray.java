package com.logical.problems.array;

public class FindMinimumSortedAndRotatedArray {

    public int calculateMinimumArrayElement(int[] nums){
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args){
        int[] nums = {3,4,6,8,1,2};
        FindMinimumSortedAndRotatedArray findMinimumSortedAndRotatedArray = new FindMinimumSortedAndRotatedArray();
        int result = findMinimumSortedAndRotatedArray.calculateMinimumArrayElement(nums);
        System.out.println("Minimum Element is at Index: "+ result);
    }
}
