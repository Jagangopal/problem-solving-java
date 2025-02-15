package com.logical.problems.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    /**
     * Time Complexity: O(n * n!)
     * Space Complexity: O(n!)
     * @param str
     * @param l
     * @param r
     * @param result
     */
    public void permutateAllStrings(String str, int l, int r, List<String> result){
        if(l == r){
            result.add(str);
            return;
        } else{
            for(int i = l; i < r; i++){
                str = swapString(str, l, i);
                permutateAllStrings(str, l + 1, r, result);
                str = swapString(str, l, i);
            }
        }
    }

    public String swapString(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        return sb.toString();
    }

    public static void main(String[] args){
        String inputString = "ABC";
        List<String> result = new ArrayList<>();
        PermutationString permutationString = new PermutationString();
        permutationString.permutateAllStrings(inputString, 0, inputString.length(), result);
        result.forEach(string -> System.out.println(string));
    }
}
