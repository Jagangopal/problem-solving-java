package com.logical.problems.array;

public class FindMinimumSortedAndRotatedArray {

    public int calculateMinimumArrayElement(int[] nums){
        int start = 0, end = nums.length - 1;
        if(nums[start] < nums[end]) return start;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid -1])
                return mid;
            if(nums[mid] > nums[mid + 1])
                return mid+1;
            if(nums[0] < nums[mid])
                start = mid + 1;
            else
                end = mid -1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {3,4,6,8,1,2};
        FindMinimumSortedAndRotatedArray findMinimumSortedAndRotatedArray = new FindMinimumSortedAndRotatedArray();
        int result = findMinimumSortedAndRotatedArray.calculateMinimumArrayElement(nums);
        System.out.println("Minimum Element is at Index: "+ result);
    }
}
