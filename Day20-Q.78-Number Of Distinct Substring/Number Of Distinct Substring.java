/*
Codding Ninjas:
*/

import java.util.* ;
import java.io.*; 


class Node{
  Node link[] = new Node[26];
  public Node(){

  }

  boolean contains(char ch){
    return link[ch-'a']!=null;
  }

  void put(char ch,Node node){
    link[ch-'a'] = node;
  }
  Node get(char ch){
    return link[ch-'a'];
  }
}

public class Solution {
    public static int distinctSubstring(String word) {
        Node root = new Node();
        int res = 0;
        for(int i=0;i<word.length();i++){
            Node node = root;
            for(int j = i;j<word.length();j++){
                if(!node.contains(word.charAt(j))){
                    res++;
                    node.put(word.charAt(j), new Node());
                }
                node = node.get(word.charAt(j));
            }
        }
        return res;
    }
}

