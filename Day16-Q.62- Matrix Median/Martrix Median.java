
/*
Codding Ninjas:
*/
import java.util.ArrayList;

public class Solution
{
		public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int n = matrix.size();
		int m = matrix.get(0).size();
		int l = 1,h=Integer.MAX_VALUE-1;
		while(l<=h){
			int mid =(l+h)>>1;
			int cnt=0;
			for(int i=0;i<matrix.size();i++){
				cnt+=countLessOrEqual(matrix.get(i),mid);
			}
			if(cnt<=(n*m)/2) l=mid+1;
			else h =mid-1;
		}
		return l;
	}
	public static int countLessOrEqual(ArrayList<Integer> row ,int mid){
		int l = 0,h = row.size()-1;
		while(l<=h){
			int m = (l+h)>>1;
			if(row.get(m)<=mid) l = m+1;
			else h = m-1;
		}
		return l;
	}
}
