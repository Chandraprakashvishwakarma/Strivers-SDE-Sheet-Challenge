/*
Q. no. 132: Symmetric Tree
*/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || helper(root.left,root.right);
    }
    public boolean helper(TreeNode left,TreeNode right){
        if(left==null || right==null) return (left==right);
        if(left.val != right.val) return false;
        return helper(left.left,right.right) && helper(left.right,right.left);
        }
}

/*
Codding Ninjas:

public class Solution {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        return (root==null) || helper(root.left,root.right);
    }
    public static boolean helper(BinaryTreeNode<Integer> left,BinaryTreeNode<Integer>right){
        if(left==null || right==null) return (left==right);
        if(!left.data.equals(right.data)) return false;
        return helper(left.left,right.right) && helper(left.right,right.left);
        }
}

*/