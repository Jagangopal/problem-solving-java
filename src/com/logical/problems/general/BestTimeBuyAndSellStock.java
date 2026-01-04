package com.logical.problems.general;

public class BestTimeBuyAndSellStock {

    /*
    Highest Profit
    Time Complexity: o(n) Space Complexity: o(1)
     */
    public int calculateMaxProfit(int[] inputArray){
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int value: inputArray){
            if(value < minValue){
                minValue = value;
            } else if((value - minValue) > maxProfit){
                maxProfit = value - minValue;
            }
        }
        return maxProfit;
    }

    /*
    Any Number of Transactions
    Time Complexity: o(n) Space Complexity: o(1)
     */
    public int calculateMaxProfitAnyNumberOfTransactions(int[] inputArray){
        int maxProfit = 0;
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] - inputArray[i-1] > 0)
                maxProfit += inputArray[i] - inputArray[i-1];
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] inputArray = {7,6,5,4,3,2,1};
        int[] inputArrayNext = {7,1,5,3,6,4};
        BestTimeBuyAndSellStock bestTimeBuyAndSellStock = new BestTimeBuyAndSellStock();
        int result = bestTimeBuyAndSellStock.calculateMaxProfitAnyNumberOfTransactions(inputArrayNext);
        System.out.println(result);
    }
}
