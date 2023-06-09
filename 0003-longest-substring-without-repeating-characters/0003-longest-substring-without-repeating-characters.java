/*
Q. no. 24 : Longest Substring Without Repeating Characters
*/
//Best Approch(solution) time:O(N) space: O(N)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int i=0,j=0;
        int longest=0;
        while(i<s.length() && j<s.length()){
            if(map.get(s.charAt(j))!=null && i<map.get(s.charAt(j))+1){
                i=map.get(s.charAt(j))+1;
            }
            map.put(s.charAt(j),j);
            longest = Math.max(longest,j-i+1);
            j++;
        }
        return longest;
    }
}

/*
Codding Ninjas: time:O(2N) space: O(N)

import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		HashSet<Character> set = new HashSet<>();
		int i=0,j=0,max=0;
		while(j<input.length()){
			if(!set.contains(input.charAt(j))){
				max = Math.max(max,j-i+1);
				set.add(input.charAt(j++));
			}
			else {
				while(set.contains(input.charAt(j))){
					set.remove(input.charAt(i++));
				}
			}
		}
		return max;
	}
}

*/