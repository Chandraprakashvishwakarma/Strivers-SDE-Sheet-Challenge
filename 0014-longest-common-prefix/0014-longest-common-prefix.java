/*
Q. no. 103: Longest Common Prefix
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0) prefix = prefix.substring(0,prefix.length()-1);
        }
        return prefix;
    }
}

/*
Codding Ninjas:

public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		String res = "";
		int i=0;
		while(true){
			char c = arr[0].charAt(i);
			for(String s:arr){
				if(i==s.length() || s.charAt(i)!=c) return res;
			}
			i++;
			res+=c;
		}
	}
}
*/