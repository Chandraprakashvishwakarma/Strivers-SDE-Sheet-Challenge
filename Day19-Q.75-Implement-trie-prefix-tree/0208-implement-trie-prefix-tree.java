
/* 
Q. no. 75: Implement Trie (Prefix Tree)
*/
class Node {
    Node [] links = new Node[26];
    boolean flag=false;

    public Node(){
    }

    boolean contains(char ch){
        return links[ch-'a']!=null;
    }
    void put(Node node,char ch){
        links[ch-'a'] = node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void setEnd(){
        flag = true;
    }
    boolean getEnd(){
        return flag;
    }
};

class Trie {
    
   
    private static Node root;

    Trie() {
        root = new Node();
    }

    //Inserts a word into the trie

    public static void insert(String word) {
        Node node = root;
        for(char ch:word.toCharArray()){
            if(!node.contains(ch)){
                node.put(new Node(),ch);
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    //Returns if the word is in the trie

    public static boolean search(String word) {
        Node node = root;
        for(char ch:word.toCharArray()){
            if(!node.contains(ch)){
                return false;
            }
            node = node.get(ch);
        }
        return node.getEnd();
    }

    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        Node node = root;
        for(char ch:prefix.toCharArray()){
            if(!node.contains(ch)) return false;
            node = node.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

/*
Codding Ninjas:

class Node {

    Node [] links = new Node[26];
    boolean flag=false;

    public Node(){
    }

    boolean contains(char ch){
        return links[ch-'a']!=null;
    }
    void put(Node node,char ch){
        links[ch-'a'] = node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void setEnd(){
        flag = true;
    }
    boolean getEnd(){
        return flag;
    }
};
public class Trie {

    private static Node root;

    Trie() {
        root = new Node();
    }

    //Inserts a word into the trie

    public static void insert(String word) {
        Node node = root;
        for(char ch:word.toCharArray()){
            if(!node.contains(ch)){
                node.put(new Node(),ch);
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    //Returns if the word is in the trie

    public static boolean search(String word) {
        Node node = root;
        for(char ch:word.toCharArray()){
            if(!node.contains(ch)){
                return false;
            }
            node = node.get(ch);
        }
        return node.getEnd();
    }

    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        Node node = root;
        for(char ch:prefix.toCharArray()){
            if(!node.contains(ch)) return false;
            node = node.get(ch);
        }
        return true;
    }
}

*/