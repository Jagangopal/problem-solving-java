package com.logical.problems.median;

import java.util.Arrays;

public class CanAttendMeetings {

    public boolean validateMeetingSchedule(int[][] inputSchedule){
        Arrays.sort(inputSchedule,(a,b) -> Integer.compare(a[0],b[0]));
        for (int[] ints : inputSchedule) {
            System.out.println(ints[0]+" "+ints[1]);
        }
        for(int i = 0; i < inputSchedule.length; i++){
            if(inputSchedule[i][1] > inputSchedule[i+1][0])
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[][] inputSchedule = {{0,30},{15,20},{5,10}};
        CanAttendMeetings canAttendMeetings = new CanAttendMeetings();
        boolean result = canAttendMeetings.validateMeetingSchedule(inputSchedule);
        System.out.println(result);
    }
}
