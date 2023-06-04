/*
Q. no. 2: Pascal's Triangle
*/class Solution {
    public List<List<Integer>> generate(int n) {
       List<List<Integer>> res = new ArrayList<>();
		for(int row=1;row<=n;row++){
			ArrayList<Integer> temp = new ArrayList<>();
			int val=1;
			temp.add(val);
			for(int col=1;col<row;col++){
				val = val*(row-col)/col;
				temp.add(val);
			}
			res.add(temp);
		}
		return res;
    }
}