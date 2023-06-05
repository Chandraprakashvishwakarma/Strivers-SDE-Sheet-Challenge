import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int left =0,top = 0,bottom = n-1,right = m-1;
        int pre=0,cur;
        while(top<bottom && left<right){
            pre = mat.get(top+1).get(left);
            
            for(int i=left;i<=right;i++){
                cur = mat.get(top).get(i);
                mat.get(top).set(i,pre);
                pre = cur;
            }
            
            top++;
            for(int i=top;i<=bottom;i++){
                cur = mat.get(i).get(right);
                mat.get(i).set(right,pre);
                pre = cur;
            }
            right--;
            for(int i=right;i>=left;i--){
                cur = mat.get(bottom).get(i);
                mat.get(bottom).set(i,pre);
                pre = cur;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                cur = mat.get(i).get(left);
                mat.get(i).set(left,pre);
                pre = cur;
            }
            left++;
        }
    }
}

