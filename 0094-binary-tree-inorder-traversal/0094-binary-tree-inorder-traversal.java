/* 
Q. no. 111: Binary Tree Inorder Traversal
*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    public void helper(TreeNode root,List<Integer> res){
        if(root==null) return;
        helper(root.left,res);
        res.add(root.val);
        helper(root.right,res);
    }
}
/*
Codding Ninjas:


public class Solution {
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List < Integer > res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    public static void helper(TreeNode root,List<Integer> res){
        if(root==null) return;
        helper(root.left,res);
        res.add(root.data);
        helper(root.right,res);
    }
}
*/