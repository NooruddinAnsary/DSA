package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitiesSelection {
    public static void main(String args[]){
        int start[] = {1, 3, 2, 5};
        int end[] =   {2, 4, 3, 6};

        int activities[][] = new int [start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sort activities based on the end times
        Arrays.sort(activities, Comparator.comparingDouble(o ->o[2]));
        ArrayList<Integer> ans = new ArrayList<>();

        int count = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1]> lastEnd) {
                count++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max act: "+count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}
