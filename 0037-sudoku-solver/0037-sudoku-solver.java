/*
Q. no. 57: Sudoku solver
*/
class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    public boolean helper(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(isSafe(board,i,j,k)){
                            board[i][j] = k;
							if(helper(board)) return true;
							else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(char [][] board,int r,int c ,int k){
        for(int i = 0;i<9;i++){
            if(board[i][c]==k) return false;
            if(board[r][i]==k) return false;
            if(board[3*(r/3)+i/3][3*(c/3)+i%3]==k) return false;
        }
        return true;
    }
}



/*
Codding Ninjas:
public class Solution {

	public static boolean isItSudoku(int board[][]) {
		return helper(board);
	}
	public static boolean helper(int [][] board){
		for(int r=0;r<9;r++){
			for(int c=0;c<9;c++){
				if(board[r][c]==0) {
					for(int k=1;k<=9;k++){
						if(isSafe(board,k,r,c)){
							board[r][c] = k;
							if(helper(board)) return true;
							else board[r][c]=0;
						}
					}
					return false;
				}	
			}
		}
		return true;
	}
	public static boolean isSafe(int [][] board,int target,int r ,int c){
		for(int i=0;i<9;i++){
			if(board[i][c]==target) return false;
			if(board[r][i]==target) return false;
			if(board[3*(r/3)+i/3][3*(c/3)+i%3]==target) return false;
		}
		return true;
	}
}

*/