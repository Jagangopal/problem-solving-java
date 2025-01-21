package com.logical.problems.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElementArray {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param arr
     * @return
     */
    public List<Integer> nextLargerElement(int[] arr){
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++)
            result.add(-1);

        for(int i = n-1; i > 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if(!stack.isEmpty())
                result.set(i, stack.peek());
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args){
        NextGreaterElementArray nextGreaterElementArray = new NextGreaterElementArray();
        int[] arr = { 6, 8, 0, 1, 3 };
        List<Integer> result = nextGreaterElementArray.nextLargerElement(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
