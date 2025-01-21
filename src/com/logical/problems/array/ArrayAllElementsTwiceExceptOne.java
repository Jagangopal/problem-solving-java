package com.logical.problems.array;

public class ArrayAllElementsTwiceExceptOne {

    public int calculateOneIdenticalElement(int[] inputArray){
        int a = 0;
        for(int i: inputArray){
            a = a ^ i;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{1,1,2,2,3,4,4};
        ArrayAllElementsTwiceExceptOne arrayAllElementsTwiceExceptOne = new ArrayAllElementsTwiceExceptOne();
        int result = arrayAllElementsTwiceExceptOne.calculateOneIdenticalElement(inputArray);
        System.out.println(result);
    }
}
