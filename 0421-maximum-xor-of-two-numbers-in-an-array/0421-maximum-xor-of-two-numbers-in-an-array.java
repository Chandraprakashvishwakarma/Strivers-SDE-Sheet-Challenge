/*
Q. no. 80: Maximum XOR of Two Numbers in an Array
*/

class Node{
    Node link[] = new Node[2];
    public Node(){

    }
    boolean contains(int bit){
        return link[bit]!=null;
    }
    void put(int bit,Node node){
        link[bit] = node;
    }
    Node get(int bit){
        return link[bit];
    }
}

class Trie{
    private static Node root;
    public Trie(){
        root= new Node();
    }

    void insert(int num){
        Node node = root;
        for(int i = 31;i>=0;i--){
            int bit = (num>>i) & 1;
            if(!node.contains(bit)){
                node.put(bit,new Node());
            }
            node = node.get(bit);
        }
    }

    int getMax(int num){
        Node node = root;
        int maxValue=0;
        for(int i = 31;i>=0;i--){
            int bit = (num>>i) & 1;
            if(node.contains(1-bit)){
                maxValue = maxValue | (1<<i);
                node = node.get(1-bit);
            }
            else {
                node = node.get(bit);
            }
        }
        return maxValue;
    }
}


class Solution {
    public int findMaximumXOR(int[] A) {
        Trie trie = new Trie();
        for(int i:A) trie.insert(i);
        int max =0;
        for(int i:A){
            max = Math.max(max,trie.getMax(i));
        }
        return max;
    }
}


/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 

class Node{
    Node link[] = new Node[2];
    public Node(){

    }
    boolean contains(int bit){
        return link[bit]!=null;
    }
    void put(int bit,Node node){
        link[bit] = node;
    }
    Node get(int bit){
        return link[bit];
    }
}

class Trie{
    private static Node root;
    public Trie(){
        root= new Node();
    }

    void insert(int num){
        Node node = root;
        for(int i = 31;i>=0;i--){
            int bit = (num>>i) & 1;
            if(!node.contains(bit)){
                node.put(bit,new Node());
            }
            node = node.get(bit);
        }
    }

    int getMax(int num){
        Node node = root;
        int maxValue=0;
        for(int i = 31;i>=0;i--){
            int bit = (num>>i) & 1;
            if(node.contains(1-bit)){
                maxValue = maxValue | (1<<i);
                node = node.get(1-bit);
            }
            else {
                node = node.get(bit);
            }
        }
        return maxValue;
    }
}
public class Solution {

    public static int maximumXor(int[] A) {
        Trie trie = new Trie();
        for(int i:A) trie.insert(i);
        int max =0;
        for(int i:A){
            max = Math.max(max,trie.getMax(i));
        }
        return max;
    }
}

*/