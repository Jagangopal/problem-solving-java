package com.logical.problems.array.twodimension;

import java.util.Arrays;
public class SearchIn2DMatrix {

    /**
     * Linear Search in 2D Array
     * Time Complexity: O(n * m)
     * Space Complexity: O(1)
     * @param arrInput
     * @param target
     * @return
     */
    public int[] SearchElementLinearApproach(int[][] arrInput, int target){
        for(int i = 0; i < arrInput.length; i++){
            for(int j = 0;j < arrInput.length; j++){
                if(arrInput[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        int[][] arrInput = {{3,12,9},{5,2,89},{90,45,22}};
        int target = 89;
        SearchIn2DMatrix searchIn2DMatrix = new SearchIn2DMatrix();
        int[] result = searchIn2DMatrix.SearchElementLinearApproach(arrInput, target);
        System.out.println(Arrays.toString(result));
    }
}
