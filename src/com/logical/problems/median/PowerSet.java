package com.logical.problems.median;
public class PowerSet {
    /**
     * Time Complexity: O(2^n)
     * Space Complexity: O(n), for recursive call stack
     * @param str
     * @param index
     * @param curr
     */
    public void computePowerSet(String str, int index, String curr){
        int n = str.length();
        if(index == n){
            System.out.println(curr);
            return;
        }
        computePowerSet(str, index + 1, curr + str.charAt(index));
        computePowerSet(str, index + 1, curr);
    }

    public static void main(String[] args){
        PowerSet powerSet = new PowerSet();
        powerSet.computePowerSet("abc", 0, "");
    }
}