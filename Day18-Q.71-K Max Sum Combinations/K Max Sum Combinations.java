/*
Codding Ninjas:
*/

// import java.util.* ;
// import java.io.*; 
// public class Solution{
// 	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
// 		PriorityQueue<Integer> pq = new PriorityQueue<>();
// 		for(int i = 0;i<a.size();i++){
// 			for(int j = 0;j<b.size();j++){
// 				pq.add(a.get(i)+b.get(j));
// 				if(pq.size()>k) pq.poll();
// 			}
// 		}
// 		ArrayList<Integer> list = new ArrayList<>(pq);
// 		Collections.sort(list,Collections.reverseOrder());
// 		return list;
// 	}
// }

import java.util.* ;
import java.io.*; 
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		PriorityQueue<Integer> sum = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(sum.size()<k){
                    sum.add(a.get(i)+b.get(j));
                }
                else{ 
                    if(a.get(i)+b.get(j)>sum.peek()){
                        sum.remove();
                        sum.add(a.get(i)+b.get(j));
                    }
                }
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        while(sum.size()!=0){
            l.add(sum.remove());
        }
        Collections.sort(l,Collections.reverseOrder());
        return l;
	}
}
