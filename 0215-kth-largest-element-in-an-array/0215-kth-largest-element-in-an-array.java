/* 
Q. no. 70: Kth largest and smallest element 
*/
class Solution {
    public int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i:arr){
			minHeap.add(i);
			if(minHeap.size()>k) minHeap.poll();
		}
		return minHeap.peek();
    }
}

/*
Codding Ninjas:

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		for(int i:arr){
			min.add(i);
			if(min.size()>k) min.poll();
			max.add(i); 
			if(max.size()>k) max.poll();
		}
		res.add(max.peek());
		res.add(min.peek());
		return res;
	}
}


*/