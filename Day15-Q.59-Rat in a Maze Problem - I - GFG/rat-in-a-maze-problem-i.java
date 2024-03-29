//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
/*
Q. no. 59: Max Consecutive Ones
*/

class Solution {
    public static ArrayList<String> findPath(int[][] maze, int n) {
        // Your code here
        ArrayList<String> res = new ArrayList<>();
        int [][] path = new int [n][n]; 
        if(maze[0][0] == 1 && maze[n-1][n-1]==1 ) helper(res,maze,path,n,0,0,"");
        return res;
    }
    public static void helper(ArrayList<String> res ,int [][] maze ,int [][]  path,int n, int row,int col,String temp){
        if(row == n-1 && col == n-1) {
            // path[row][col]=1;
            // build(res,path,n);
            // path[row][col]=0;
            res.add(temp);
            return;
        }
        //down
        if(row+1<n && path[row+1][col]==0 && maze[row+1][col]==1){
            path[row][col]=1;
            temp+='D';
            helper(res,maze,path,n,row+1,col,temp);
            path[row][col]=0;
            temp = temp.substring(0,temp.length()-1);
        }
        //left
        if(col-1>=0 && path[row][col-1]==0 && maze[row][col-1]==1){
            path[row][col]=1;
            temp+='L';
            helper(res,maze,path,n,row,col-1,temp);
            path[row][col]=0;
            temp = temp.substring(0,temp.length()-1);
        }
        //right
        if(col+1<n && path[row][col+1]==0 && maze[row][col+1]==1){
            path[row][col]=1;
            temp+='R';
            helper(res,maze,path,n,row,col+1,temp);
            path[row][col]=0;
            temp = temp.substring(0,temp.length()-1);
        }
        //up
        if(row-1>=0 && path[row-1][col]==0 && maze[row-1][col]==1){
            path[row][col]=1;
            temp+='U';
            helper(res,maze,path,n,row-1,col,temp);
            path[row][col]=0;
            temp = temp.substring(0,temp.length()-1);
        }
    }

    // public static void build(ArrayList<String> res ,int [][] path,int n){
    //     String temp ="";
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             temp+=('0'+path[i][j]);
    //         }
    //     }
    //     res.add(temp);
    // }
}

/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int [][] path = new int [n][n]; 
        if(maze[0][0] == 1 && maze[n-1][n-1]==1 ) helper(res,maze,path,n,0,0);
        return res;
    }
    public static void helper(ArrayList<ArrayList<Integer>> res ,int [][] maze ,int [][]  path,int n, int row,int col){
        if(row == n-1 && col == n-1) {
            path[row][col]=1;
            build(res,path,n);
            path[row][col]=0;
            return;
        }
        //down
        if(row+1<n && path[row+1][col]==0 && maze[row+1][col]==1){
            path[row][col]=1;
            helper(res,maze,path,n,row+1,col);
            path[row][col]=0;
        }
        //left
        if(col-1>=0 && path[row][col-1]==0 && maze[row][col-1]==1){
            path[row][col]=1;
            helper(res,maze,path,n,row,col-1);
            path[row][col]=0;
        }
        //right
        if(col+1<n && path[row][col+1]==0 && maze[row][col+1]==1){
            path[row][col]=1;
            helper(res,maze,path,n,row,col+1);
            path[row][col]=0;
        }
        //up
        if(row-1>=0 && path[row-1][col]==0 && maze[row-1][col]==1){
            path[row][col]=1;
            helper(res,maze,path,n,row-1,col);
            path[row][col]=0;
        }
    }

    public static void build(ArrayList<ArrayList<Integer>> res ,int [][] path,int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                temp.add(path[i][j]);
            }
        }
        res.add(new ArrayList<>(temp));
    }
}

*/