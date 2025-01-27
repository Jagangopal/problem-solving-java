package com.logical.problems.array;

public class SortedAndRotatedArrays {

    public int searchElement(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && nums[mid] > target)
                    end = mid -1;
                else
                    start = mid + 1;
            } else {
                if(nums[mid] < target && nums[end] >= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {2,5,7,8,9,1};
        SortedAndRotatedArrays sortedAndRotatedArrays = new SortedAndRotatedArrays();
        int result = sortedAndRotatedArrays.searchElement(nums, 5);
        System.out.println("Element is present at index: " + result);
    }
}
