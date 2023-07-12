/* 
Q. no. 156: Flood Fill Algorithm
*/
class Solution {
    public int[][] floodFill(int[][] image, int x, int y, int newColor) {
        if(image[x][y] == newColor) return image;
        helper(image,x,y,image[x][y],newColor);
        return image;
    }
    public void helper(int[][] image,int x,int y,int old, int newColor){
        if(x<0 || x>=image.length || y<0 || y>=image[0].length || image[x][y]!=old) return;
        image[x][y] = newColor;
        helper(image,x-1,y,old,newColor);
        helper(image,x,y-1,old,newColor);
        helper(image,x+1,y,old,newColor);
        helper(image,x,y+1,old,newColor);
    }
}

/*
Codding Ninjas:

public class Solution
{
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        if(image[x][y] == newColor) return image;
        helper(image,x,y,image[x][y],newColor);
        return image;
    }
    public static void helper(int[][] image,int x,int y,int old, int newColor){
        if(x<0 || x>=image.length || y<0 || y>=image[0].length || image[x][y]!=old) return;
        image[x][y] = newColor;
        helper(image,x-1,y,old,newColor);
        helper(image,x,y-1,old,newColor);
        helper(image,x+1,y,old,newColor);
        helper(image,x,y+1,old,newColor);
    }

}


*/