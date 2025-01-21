package com.dp.problems;
public class ClimbingStairs {

    public int possibleWaysToClimb(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int result = climbingStairs.possibleWaysToClimb(4);
        System.out.println(result);
    }
}
