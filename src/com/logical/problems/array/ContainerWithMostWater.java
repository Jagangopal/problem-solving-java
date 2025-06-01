package com.logical.problems.array;

public class ContainerWithMostWater {

    public int calculateContainerWithMostWater(int[] inputArray){
        int left = 0, right = inputArray.length - 1;
        int max = 0;
        while(left < right){
            int minValue = Math.min(inputArray[left], inputArray[right]);
            int width = right - left;
            int area = minValue * width;
            if (max < area) {
                max = area;
            } else if(inputArray[left] < inputArray[right]) {
                left++;
            } else{
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args){
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] inputArray = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.calculateContainerWithMostWater(inputArray));
    }
}
