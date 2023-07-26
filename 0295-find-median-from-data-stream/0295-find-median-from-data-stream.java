
/*
Q. no. 72: Running Median(Find Median from Data Stream)
*/
class MedianFinder {
    PriorityQueue<Double> min ;
	PriorityQueue<Double> max ;
    
    public MedianFinder() {
         min = new PriorityQueue<>();
		 max = new PriorityQueue<>(Collections.reverseOrder());
        
    }
    
    public void addNum(int i) {
        if(max.size() == 0 || i<max.peek()) max.add((double)i);
			else min.add((double)i);

			if(max.size()-min.size()>1) min.add(max.remove());
			else if(min.size()-max.size()>1) max.add(min.remove());

    }
    
    public double findMedian() {
        if(max.size() == min.size()) return (max.peek()+min.peek())/2;
			else if(max.size()>min.size()) return max.peek();
			else return min.peek();
    }
}

/**

Codding Ninjas: 


 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 
 
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

	public static void findMedian(int arr[])  {
        PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

		for(int i: arr){
			if(max.size() == 0 || i<max.peek()) max.add(i);
			else min.add(i);

			if(max.size()-min.size()>1) min.add(max.remove());
			else if(min.size()-max.size()>1) max.add(min.remove());

			if(max.size() == min.size()) System.out.print((max.peek()+min.peek())/2+" ");
			else if(max.size()>min.size()) System.out.print(max.peek()+" ");
			else System.out.print(min.peek()+" ");
		}
		return;
    }
}
 */

