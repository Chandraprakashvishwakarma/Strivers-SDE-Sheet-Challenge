/* 
Q. no. 101: Roman to Integer
*/
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);
        map.put('C',100);map.put('D',500);map.put('M',1000);
        
        int res = 0;
        
        for(int i=s.length()-1;i>=0;i--){
            if(i == s.length()-1) 
                res = map.get(s.charAt(i));
            else if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
                res = res - map.get(s.charAt(i));
            else 
                res = res + map.get(s.charAt(i));
        }
        return res;
    }
}
/*
Codding Ninjas:
(Java IDE was not working) 

#include<unordered_map>
int romanToInt(string s) {
    int sum = 0;
    unordered_map<char, int> mp = {
        {'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}
    };
    for(int i = 0; i < s.length(); i++)
        mp[s[i]] < mp[s[i+1]] ? sum -= mp[s[i]] : sum += mp[s[i]];
    return sum;
}
*/