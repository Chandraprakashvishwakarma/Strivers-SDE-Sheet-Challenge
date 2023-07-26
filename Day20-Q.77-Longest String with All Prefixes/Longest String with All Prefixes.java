/*
Codding Ninjas:
*/

import java.util.* ;
import java.io.*; 

class Node{
  Node link[] = new Node[26];
  boolean flag = false;
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

  void end(){
    flag = true;
  }

  boolean isEnd(){
    return flag;
  }
}

class Trie{
  Node root;
  public Trie(){
    root = new Node();
  }

  void insert(String word){
    Node node = root;
    for(char ch:word.toCharArray()){
      if(!node.contains(ch)){
        node.put(ch,new Node());
      }
      node = node.get(ch);
    }
    node.end();
  }

  boolean checkIfPrefixExist(String word){
    Node node = root;
    boolean flag = true;
    for(char ch :word.toCharArray()){
      if(node.contains(ch)){
        node = node.get(ch);
        if(node.isEnd() == false) return false;
      }
      else return false;
    }
    return true;
  }
}

class Solution {


  public static String completeString(int n, String[] a) {
    Trie trie = new Trie();
    for(String s :a){
      trie.insert(s);
    }
    String longest = "";
    for(String s :a){
      if(trie.checkIfPrefixExist(s)){
        if(s.length()>longest.length()) longest = s;
        else if(longest.length()==s.length() && s.compareTo(longest)<0){
          longest=s;
        }
      }
    }
    if(longest.length()==0) return "None";
    return longest;
  }
}
