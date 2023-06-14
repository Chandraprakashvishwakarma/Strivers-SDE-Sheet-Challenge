//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

/*
Q. no. 43: Maximum meetings
*/
class Solution 
{
    public static int maxMeetings(int start[], int end[], int n)
    {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> temp = new ArrayList(Arrays.asList(start[i-1],end[i-1],i));
            l.add(temp);
        }
        Collections.sort(l,Comparator.comparing(list -> list.get(1)));
        ans.add(l.get(0).get(2));
        int timeLimit = l.get(0).get(1);

        for (int i = 1; i < n; i++) {
            if (l.get(i).get(0) > timeLimit) {
                ans.add(l.get(i).get(2));
                timeLimit = l.get(i).get(1);
            }
        }
        return ans.size();
    }
}

/*
Codding Ninjas:
Problem : Return list of position of maximum meetings that can be held in room.

import java.util.*;
import java.io.*;
public class Solution {
  public static List < Integer > maximumMeetings(int[] start, int[] end) {
    int n = start.length;
    List<List<Integer>> lss = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      List<Integer> ls = new ArrayList<>();
      ls.add(start[i]);
      ls.add(end[i]);
      ls.add(i);
      lss.add(ls);
    }
    Collections.sort(lss, (a, b) -> (a.get(1) - b.get(1)));
    List<Integer> l1 = new ArrayList<>();
    int e1 = lss.get(0).get(1);
    l1.add(lss.get(0).get(2) + 1);
    for (int i = 1; i < lss.size(); i++) {
      if (e1 < lss.get(i).get(0)) {
        l1.add(lss.get(i).get(2) + 1);
        e1 = lss.get(i).get(1);
      }
    }
    return l1;
  }
}

*/
