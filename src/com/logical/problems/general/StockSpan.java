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
     * @param inputArray
     * @return spans
     */
    public int[] calculateStockSpan(int[] inputArray){
        int[] spans = new int[inputArray.length];
        spans[0] = 1;
        Stack<Integer> indexStack = new Stack<>();
        indexStack.push(0);
        for(int i=1; i<inputArray.length; i++){
            while(!indexStack.isEmpty() && inputArray[indexStack.peek()] <= inputArray[i]){
                indexStack.pop();
            }
            if(indexStack.isEmpty())
                spans[i] = i + 1;
            else
                spans[i] = i - indexStack.peek();
            indexStack.push(i);
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
