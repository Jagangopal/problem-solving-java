package com.logical.problems.array;

public class MergeArrays {
    /*
    Merge the two arrays into one sorted arrays.
    Input: list1 = [1,2,4], list2 = [2,3,4]
    Output: [1,2,2,3,4,4]
     */
    public int[] mergeArraysMethod(int[] arrOne, int[] arrTwo){
        int[] result = new int[arrOne.length + arrTwo.length];
        int count = 0;
        /*
        for(int i: arrOne){
            result[count] = i;
            count++;
        }
        for(int i: arrTwo){
            result[count] = i;
            count++;
        }
        Arrays.sort(result);
         */
        int i = 0;
        int j = 0;
        int n1 = arrOne.length;
        int n2 = arrTwo.length;

        while(i < n1 && j < n2 ) {
            if (arrOne[i] < arrTwo[j]) {
                result[count++] = arrOne[i++];
            } else {
                result[count++] = arrTwo[j++];
            }
        }
        while(i < n1){
            result[count++] = arrOne[i++];
        }

        while(j < n2){
            result[count++] = arrOne[j++];
        }

        return result;
    }

    public static void main(String[] args){
        int[] list1 = {1,2,4};
        int[] list2 = {2,3,4};
        MergeArrays mergeArrays = new MergeArrays();
        int[] result = mergeArrays.mergeArraysMethod(list1, list2);
        for(int i:result){
            System.out.println(i);
        }
    }
}

/*
Collection<Collection<T>> -> Collection<T>
Flat Map - streams
 */
