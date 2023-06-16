/*
Q. no. 46: Fractional Knapsack
*/
/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) 
    {
        Arrays.sort(arr,new Comparator<Item>(){
           public int compare(Item i1, Item i2) {
               return i2.value*i1.weight - i2.weight * i1.value;
           }
       });
       double ans = 0;
       for(int i =0;i<n;i++) {
           if(w>=arr[i].weight) {
               ans += arr[i].value;
               w -= arr[i].weight;
           } else {
               ans += (double)arr[i].value*w/(double)arr[i].weight;
               break;
           }
       }
       return ans;
        
    }
}

/*
Codding Ninjas:

import java.util.*;
public class Solution {
   public static double maximumValue(Pair[] items, int n, int w) {
       Arrays.sort(items,new Comparator<Pair>(){
           public int compare(Pair i1, Pair i2) {
               return i2.value*i1.weight - i2.weight * i1.value;
           }
       });
       double ans = 0;
       for(int i =0;i<n;i++) {
           if(w>=items[i].weight) {
               ans += items[i].value;
               w -= items[i].weight;
           } else {
               ans += (double)items[i].value*w/(double)items[i].weight;
               break;
           }
       }
       return ans;
   }
}
*/

//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends

