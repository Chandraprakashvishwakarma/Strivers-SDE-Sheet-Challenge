//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends

/*
Q. no. 45: Job Sequencing Problem
*/
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
      Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

      int maxi = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i].deadline > maxi) {
            maxi = arr[i].deadline;
         }
      }

      int result[] = new int[maxi + 1];

      for (int i = 1; i <= maxi; i++) {
         result[i] = -1;
      }

      int countJobs = 0, jobProfit = 0;

      for (int i = 0; i < n; i++) {

         for (int j = arr[i].deadline; j > 0; j--) {

            // Free slot found 
            if (result[j] == -1) {
               result[j] = i;
               countJobs++;
               jobProfit += arr[i].profit;
               break;
            }
         }
      }

      int ans[] = new int[2];
      ans[0] = countJobs;
      ans[1] = jobProfit;
      return ans;
        
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/

/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        Arrays.sort(jobs,(x,y)->y[1]-x[1]);
        int max = 0;
        for(int i=0;i<jobs.length;i++){
            max = Math.max(max,jobs[i][0]);
        }
        int [] time = new int [max+1];
        Arrays.fill(time,-1);
        int profit = 0;
        for(int i=0;i<jobs.length;i++){
            for(int j = jobs[i][0]-1;j>=0;j--){
                if(time[j]==-1){
                    profit+=jobs[i][1];
                    time[j] = 1;
                    break;
                }
            }
        } 
        return profit;
    }
}

*/