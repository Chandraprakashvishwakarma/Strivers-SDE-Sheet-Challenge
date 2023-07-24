/*
Q. no. 56: N-Queens
*/
class Solution {
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList();
        char [][] chess = new char [n][n];
        for(char [] c:chess) Arrays.fill(c,'.');
        helper(chess,0,n);
        return res;
    }
    
    public void helper(char [][] chess , int col,int n){
        if(col == n){
            res.add(build(chess));
            return;
        }
        
        for(int row =0;row <n;row++){
            if(isSafe(chess,row,col)){
                chess[row][col] ='Q';
                helper(chess,col+1,n);
                chess[row][col] ='.';
            }
        }
    }
    
    boolean isSafe(char [][] chess,int row,int col){
        for(int i=0;i<col;i++){
            if(chess[row][i] == 'Q')  return false;
        }
        
        int r=row-1,c=col-1;
        while(r>=0 && c>=0){
            if(chess[r--][c--] == 'Q') return false;
        }
        r=row+1;c=col-1;
        while(r<chess.length && c>=0){
            if(chess[r++][c--] == 'Q') return false;
        }
        return true;
    }
    
    List<String> build(char [][] chess){
        List<String> temp = new ArrayList();
        for(char [] c:chess){
            temp.add(new String(c));
        }
        return temp;
    }
}

/*
Codding Ninjas:

import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int [][] board = new int [n][n];
        helper(res,board,0);
        return res;
    }
    public static void helper(ArrayList<ArrayList<Integer>> res,int [][] board,int row){
        if(row == board.length) {build(board,res);return;}
        for(int col=0;col<board.length;col++){ 
            if(isSafe(board,row,col)){
                board[row][col]=1;
                helper(res,board,row+1);
                board[row][col]=0;
            }
        }
        return;
    }

    public static boolean isSafe(int [][] board,int row ,int col){
        int r = row-1,c =col-1;
        while(r>=0 && c>=0){
            if(board[r--][c--]==1) return false;
        }
        r=row-1;c=col+1;
        while(r>=0 && c<board.length){
            if(board[r--][c++]==1) return false;
        }
        r = row-1;c =col;
        while(r>=0){
            if(board[r--][c]==1) return false;
        }
        return true;
    }
    public static void build(int [][] board,ArrayList<ArrayList<Integer>> res){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int [] i:board){
            for(int j:i){
                temp.add(j);
            }
        }
        res.add(temp);
    }
}
*/