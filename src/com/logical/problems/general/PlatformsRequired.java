package com.logical.problems.general;

import java.util.Arrays;

public class PlatformsRequired {

    public int findNumberOfPlatformRequired(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 1, j = 0;
        int result = 1, platform_needed = 1;
        while(i < arrival.length && j < arrival .length){
            if(arrival[i] <= departure[j]){
                platform_needed++;
                i++;
            } else if(arrival[i] > departure[j]){
                platform_needed--;
                j++;
            }
        }
        return platform_needed;
    }

    public static void main(String[] args){
        int[] arrival = {100,300,500};
        int[] departure = {900,400,600};
        PlatformsRequired platformsRequired = new PlatformsRequired();
        int result = platformsRequired.findNumberOfPlatformRequired(arrival, departure);
        System.out.println("Total Number of Platforms Required: "+ result);
    }
}
