package com.streams.problems;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrencesString {

    public Map<Character, Long> calcStreamsSolution(String message){
        Map<Character, Long> counterMap = message
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        return counterMap;
    }
    public String compressString(String message){
        StringBuilder compressString = new StringBuilder();
        int count = 0;
        for(int i = 0; i < message.length(); i++){
            count++;
            if(i+1 == message.length()
                    || message.charAt(i) != message.charAt(i+1)){
                compressString.append(message.charAt(i)).append(count);
                count = 0;
            }
        }
        return compressString.toString().length() < message.length()?compressString.toString():null;
    }
    public static void main(String[] args){
        CountOccurrencesString solution = new CountOccurrencesString();
        Map<Character, Long> resMap = solution.calcStreamsSolution("aaabcccc");
        String resultString = solution.compressString("aaabcccc");
        System.out.println(resMap);
        System.out.print(resultString);
    }
}
