package com.logical.problems.general;

public class PalindromicNumber {

    public int calculatePalindromicNumber(int input){
        int revInteger = 0;
        while (input > 0){
            revInteger = revInteger * 10 + (input % 10);
            input = input / 10;
        }
        return revInteger;
    }

    public static void main(String[] args){
        PalindromicNumber palindromicNumber = new PalindromicNumber();
        int result = palindromicNumber.calculatePalindromicNumber(987654321);
        System.out.println(result);
    }
}
