package com.logical.problems.array.twodimension;

import java.util.Arrays;

public class Search2DMatrixSorted {

    /**
     * Binary Search in 2D Matrix
     * Time Complexity: O(log(mn))
     * Space Complexity: O(1)
     * @param arrInput
     * @param target
     * @return
     */
    public boolean findElementBinarySearch(int[][] arrInput, int target){
        int n = arrInput.length, m = arrInput[0].length;
        int start = 0, end = n * m -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int row =mid / m;
            int col =mid % m;
            if(arrInput[row][col] == target)
                return true;
            if(arrInput[row][col] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    public static void main(String[] args){
        int[][] arrInput = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 30;
        Search2DMatrixSorted search2DMatrixSorted = new Search2DMatrixSorted();
        boolean result = search2DMatrixSorted.findElementBinarySearch(arrInput, target);
        System.out.println(result);
    }
}