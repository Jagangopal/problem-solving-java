package com.logical.problems.general;

import java.util.Arrays;
import java.util.Stack;

/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class StockSpan {
    /**
     * This method calculates stock span
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param inputArray
     * @return spans
     */
    public int[] calculateStockSpan(int[] inputArray){
        int[] spans = new int[inputArray.length];
        spans[0] = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i < inputArray.length; i++){
            while(!stack.isEmpty() && inputArray[stack.peek()] <= inputArray[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                spans[i] = i + 1;
            else
                spans[i] = i - stack.peek();
            stack.push(i);
        }
        return spans;
    }
    public static void main(String[] args){
        StockSpan stockSpan = new StockSpan();
        int[] inputArray = {100, 80, 60, 70, 60, 75, 85};
        int[] result = stockSpan.calculateStockSpan(inputArray);
        System.out.print(Arrays.toString(result));
    }
}
