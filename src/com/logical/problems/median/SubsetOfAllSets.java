package com.logical.problems.median;

import java.util.ArrayList;

public class SubsetOfAllSets {
    /**
     * Time Complexity: O(2^n)
     * Space Complexity: O(2^n)
     * @param arr
     * @param index
     * @param currentSubset
     */
    public void calculateAllSubsets(int[] arr, int index, ArrayList<Integer> currentSubset){
        if(index >= arr.length){
            System.out.println(currentSubset);

            return;
        }
        calculateAllSubsets(arr, index + 1, (ArrayList<Integer>) currentSubset.clone());
        currentSubset.add(arr[index]);
        calculateAllSubsets(arr, index + 1, currentSubset);
    }

    public static void main(String[] args){
        SubsetOfAllSets subsetOfAllSets = new SubsetOfAllSets();
        subsetOfAllSets.calculateAllSubsets(new int[]{1,2,3}, 0, new ArrayList<>());
    }
}
