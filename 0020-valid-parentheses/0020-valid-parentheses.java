/*
Q. no. 86: Palindrome Partitioning
LeetCode:
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
            else if(!st.isEmpty()){
                if(ch == ')' && st.peek()=='(') st.pop();
                else if(ch == ']' && st.peek()=='[') st.pop();
                else if(ch == '}' && st.peek()=='{') st.pop();
                else return false;
            }
            else return false;
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}

/*

Codding ninjas:

import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0;i<expression.length();i++){
            char c = expression.charAt(i);
            
            if(c =='{'||c=='['||c =='(') {
                st.push(c);
            }
            else if(!st.isEmpty()){
                if(c == ')' && st.peek() == '(') st.pop();
                else if(c == ']' && st.peek() == '[') st.pop();
                else if(c == '}' && st.peek() == '{') st.pop();
                else return false;
            }
            else return false;
        }
        if(st.size()>0) return false;
        return true;
    }
}

*/