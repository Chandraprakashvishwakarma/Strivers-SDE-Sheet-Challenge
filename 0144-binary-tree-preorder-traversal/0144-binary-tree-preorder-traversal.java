/* 
Q. no. 112: Binary Tree Preorder Traversal
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList<>();
		helper(root,res);
		return res;
    }
    public void helper(TreeNode root,List<Integer> res){
		if(root == null) return;
		res.add(root.val);
		helper(root.left,res);
		helper(root.right,res);
	}
}
/*
Codding Ninjas:

public class Solution {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List < Integer > res = new ArrayList<>();
		helper(root,res);
		return res;
    }
	public static void helper(TreeNode root,List<Integer> res){
		if(root == null) return;
		res.add(root.data);
		helper(root.left,res);
		helper(root.right,res);

	}
}
*/