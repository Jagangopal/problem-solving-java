package com.logical.problems.string;

public class RotateStringContains {

    public boolean rotateStringContains(String str, String strRotate){
        return (str.length() == strRotate.length()) &&
                ((str+str).contains(strRotate));
    }

    public static void main(String[] args){
        RotateStringContains rotateStringContains = new RotateStringContains();
        boolean result = rotateStringContains.rotateStringContains("abc", "cab");
        System.out.println(result);
    }
}
