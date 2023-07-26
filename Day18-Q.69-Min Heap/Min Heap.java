/*
Codding Ninjas:
*/
import java.util.* ;
import java.io.*; 

public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int [] temp: q){
            if(temp.length>1){
                pq.add(temp[1]);
            }
            else {
                res.add(pq.poll());
            }
        }
        int [] ans = new int [res.size()]; 
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
