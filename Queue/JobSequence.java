package Queue;
import java.util.*;

public class JobSequence {
    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static int maxProfit(char[] jobs, int[] deadlines, int[] profits) {
        int n = jobs.length;

        // Step 1: Combine jobs, deadlines, and profits into Job array
        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Job(jobs[i], deadlines[i], profits[i]);
        }

        // Step 2: Sort jobs based on profit in descending order
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        // Find the maximum deadline to determine the size of slot array
        int maxDeadline = 0;
        for (Job job : arr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Initialize slots array to track availability of deadlines
        char[] timeline = new char[maxDeadline];
        Arrays.fill(timeline, '*');

        // Step 4: Fill the timeline with the jobs to maximize profit
        int totalProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline - 1; j >= 0; j--) {
                if (timeline[j] == '*') {
                    timeline[j] = arr[i].id;
                    totalProfit += arr[i].profit;
                    break;
                }
            }
        }

        // Step 5: Print the sequence of jobs scheduled
        System.out.print("Jobs scheduled: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (timeline[i] != '*') {
                System.out.print(timeline[i] + " ");
            }
        }
        System.out.println();

        return totalProfit;
    }

    public static void main(String[] args) {
        char[] jobs = {'a', 'b', 'c', 'd'};
        int[] deadlines = {4, 1, 1, 1};
        int[] profits = {20, 10, 40, 30};

        int maxProfit = maxProfit(jobs, deadlines, profits);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
