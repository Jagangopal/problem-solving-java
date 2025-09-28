package com.dp.problems;

public class CoinChange {
    /**
     * Time Complexity: O(n * sum)
     * Space Complexity: O(sum)
     * @param coins
     * @param sum
     * @return
     */
    public static int count(int[] coins, int sum){
        int n = coins.length;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = coins[i]; j <= sum; j++){
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 5;
        System.out.println(count(coins, sum));
    }
}
