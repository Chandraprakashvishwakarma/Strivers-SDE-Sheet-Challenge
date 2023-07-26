/*
Codding Ninjas:
*/

import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] rooms, int n,  int c) 
	{
        Arrays.sort(rooms);
        int l = 1,h = rooms[n-1]-1;//minimum diff can be 1 and maximum diff can be max(rooms)-1
        while(l<=h){
            int mid = l+(h-l)/2;
            if(check(mid,rooms,c)) l=mid+1;
            else h = mid-1;
        }
        return h;
    }
    public static boolean check(int dif , int [] rooms,int players){
        players--;
        int pre = rooms[0];
        for(int i=1;i<rooms.length;i++){
            if(players <= 0 ) return true;
            if(rooms[i]-pre>=dif) {
                players--;
                pre = rooms[i];
            }
        }
        if(players <= 0 ) return true;
        else return false;
    }

}
