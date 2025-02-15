package com.logical.problems.string;

public class AllUniqueCharactersString {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param inputString
     * @return
     */
    public boolean isUniqueCharactersInString(String inputString){
        if(inputString.length() > 128) return false;
        boolean[] chars = new boolean[128];

        for(char ch: inputString.toCharArray()){
            if(chars[ch]){
                return false;
            }else{
                chars[ch] = true;
            }
        }

        return true;
    }

    public static void main(String[] args){
        AllUniqueCharactersString allUniqueCharactersString = new AllUniqueCharactersString();
        System.out.print(allUniqueCharactersString.isUniqueCharactersInString("coret"));
    }
}
