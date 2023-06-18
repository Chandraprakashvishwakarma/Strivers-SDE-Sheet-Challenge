//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends

/*
Q. no. 58: M-Coloring Problem
*/
class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int [] color = new int [n];
        return helper(graph,color,0,m,n);
    }
    public boolean helper(boolean [][] mat , int [] color,int node,int m,int n){
		if(node == n) return true;
		for(int i=1;i<=m;i++){
			if(possible(mat,i,node,color)){
				color[node] = i;
				if(helper(mat,color,node+1,m,n)) return true;
				else color[node] = 0;
			}
		}
		return false;
	}
	public boolean possible(boolean [][] mat,int k,int node,int [] color){
		boolean [] temp=mat[node];
			for(int j=0;j<temp.length;j++){
				if(temp[j]==true && color[j]==k) return false;
			}
		return true;
	}
}

/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution {
	public static String graphColoring(int[][] mat, int m) {
		int [] color = new int [mat.length];
		 if(helper(mat,color,0,m)) return "YES";
		 else return "NO";
	}
	public static boolean helper(int [][] mat , int [] color,int node,int m){
		if(node == mat.length) return true;
		for(int i=1;i<=m;i++){
			if(possible(mat,i,node,color)){
				color[node] = i;
				if(helper(mat,color,node+1,m)) return true;
				else color[node] = 0;
			}
		}
		return false;
	}
	public static boolean possible(int [][] mat,int k,int node,int [] color){
		 int [] temp=mat[node];
			for(int j=0;j<temp.length;j++){
				if(temp[j]==1 && color[j]==k) return false;
			}
		return true;
	}
}
*/