/*
Q. no. 130: Construct Binary Tree from Preorder and Inorder Traversal
*/
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map < Integer, Integer > inMap = new HashMap < Integer, Integer > ();
    for (int i = 0; i < inorder.length; i++) {
      inMap.put(inorder[i], i);
    }
    TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, 
    inorder.length - 1, inMap);
    return root;
    }
    static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[]
  inorder, int inStart, int inEnd, Map < Integer, Integer > inMap) {
    if (preStart > preEnd || inStart > inEnd) return null;

    TreeNode root = new TreeNode(preorder[preStart]);
    int inRoot = inMap.get(root.val);
    int numsLeft = inRoot - inStart;

    root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, 
    inStart, inRoot - 1, inMap);
    root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, 
    inRoot + 1, inEnd, inMap);

    return root;
  }
}

/*

Codding Ninjas: 

import java.util.* ;
import java.io.*; 

public class Solution 
{
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        Map < Integer, Integer > inMap = new HashMap < Integer, Integer > ();
    for (int i = 0; i < inorder.size(); i++) {
      inMap.put(inorder.get(i), i);
    }
    TreeNode<Integer> root = buildTree(preorder, 0, preorder.size() - 1, inorder, 0, 
    inorder.size() - 1, inMap);
    return root;
    }
    public static TreeNode<Integer> buildTree(ArrayList<Integer> preorder, int preStart, int preEnd, ArrayList<Integer>
  inorder, int inStart, int inEnd, Map < Integer, Integer > inMap) {
    if (preStart > preEnd || inStart > inEnd) return null;

    TreeNode root = new TreeNode(preorder.get(preStart));
    int inRoot = inMap.get(root.data);
    int numsLeft = inRoot - inStart;

    root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, 
    inStart, inRoot - 1, inMap);
    root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, 
    inRoot + 1, inEnd, inMap);

    return root;
  }
}


*/
