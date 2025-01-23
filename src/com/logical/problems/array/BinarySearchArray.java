package com.logical.problems.array;

public class BinarySearchArray {

    /**
      Time Complexity: o(log n)
      Space Complexity: o(1)
     */
    public int binarySearch(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {2,3,5,7,9,10};
        BinarySearchArray binarySearchArray = new BinarySearchArray();
        int result = binarySearchArray.binarySearch(nums, 7);
        System.out.println("Element found at Index: " + result);
    }
}
