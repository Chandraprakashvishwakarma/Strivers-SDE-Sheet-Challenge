class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List<Integer> res = new ArrayList();
        long val = 1;
        res.add((int)val);
        for(int col=1;col<rowIndex;col++){
            val = val*(rowIndex-col)/col;
            res.add((int)val);
        }
        return res;
    }
}