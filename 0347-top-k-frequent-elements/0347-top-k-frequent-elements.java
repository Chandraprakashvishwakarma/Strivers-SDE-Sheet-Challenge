
/* 
Q. no. 74: Kth Top K Frequent Elements
*/
class data{
    int val1,val2;
    data(int val1,int val2){
        this.val1=val1;
        this.val2=val2;
    }
}

class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        PriorityQueue<data>p=new  PriorityQueue<>(Comparator.comparingInt(a -> a.val1));
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i :arr) map.put(i,map.getOrDefault(i,0)+1);
		for(int i:map.keySet()){
			data d = new data(map.get(i),i);
			p.add(d);
			if(p.size()>k) p.poll();
		}
		int [] res = new int[k];
		for(int i=0;i<k;i++){
			res[i] = p.poll().val2;
		}
		return res;
    }
}


/*
Codding Ninjas:


import java.util.* ;
import java.io.*; 

class data{
    int val1,val2;
    data(int val1,int val2){
        this.val1=val1;
        this.val2=val2;
    }
}
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		PriorityQueue<data>p=new  PriorityQueue<>(Comparator.comparingInt(a -> a.val1));
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i :arr) map.put(i,map.getOrDefault(i,0)+1);
		for(int i:map.keySet()){
			data d = new data(map.get(i),i);
			p.add(d);
			if(p.size()>k) p.poll();
		}
		int [] res = new int[k];
		for(int i=0;i<k;i++){
			res[i] = p.poll().val2;
		}
		Arrays.sort(res);
		return res;
	}

}


*/