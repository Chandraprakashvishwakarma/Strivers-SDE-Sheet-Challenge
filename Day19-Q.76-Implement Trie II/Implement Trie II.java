/*
Codding Ninjas:
*/

import java.util.* ;
import java.io.*; 
class Node{
    Node link [] = new Node[26];
    int endsWith=0;
    int countPrefix=0;
    public Node(){
    }

    boolean contains(char ch){
        return link[ch-'a']!=null;
    }
    void put(Node node ,char ch){
        link[ch-'a'] = node;
    }
    Node get(char ch){
        return link[ch-'a'];
    }
    
    int getEW(){
        return endsWith;
    }
    void incrementEW(){
        endsWith++;
    }
    void decrementEW(){
        endsWith--;
    }

    int getCP(){
        return countPrefix;
    }
    void incrementCP(){
        countPrefix++;
    }
    void decrementCP(){
        countPrefix--;
    }
};
public class Trie {
    private Node root;
    public Trie() {
        root = new Node();
    }
    public void insert(String word) {
        Node node = root;
        for(char ch:word.toCharArray()){
            if(!node.contains(ch)) {
                node.put(new Node(), ch);
            }
            node = node.get(ch);
            node.incrementCP();
        }
        node.incrementEW();
    }
    public int countWordsEqualTo(String word) {
        Node node = root;
        for(char ch:word.toCharArray()){
            if(node.contains(ch)) node = node.get(ch);
            else return 0;
        }
        return node.getEW();
    }
    public int countWordsStartingWith(String word) {
        Node node = root;
        for(char ch:word.toCharArray()){
            if(node.contains(ch)) node = node.get(ch);
            else return 0;
        }
        return node.getCP();
    }
    public void erase(String word) {
        Node node =root;
        for(char ch : word.toCharArray()){
            if(node.contains(ch)){
                node = node.get(ch);
                node.decrementCP();
            }
            else return;
        }
        node.decrementEW();
    }
}
