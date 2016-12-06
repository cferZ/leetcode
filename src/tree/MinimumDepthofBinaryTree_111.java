package tree;

import tree.PathSum_112.TreeNode;

public class MinimumDepthofBinaryTree_111 {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public int minDepth(TreeNode root) {
    	if(root==null)
    		return 0;
    	return findMinDepth(root);
    }
    public int findMinDepth(TreeNode root){
    	if(root==null){
    		return Integer.MAX_VALUE;
    	}
    	else if(isLeaf(root))
    		return 1;
    	else
    		return Math.min(findMinDepth(root.left),findMinDepth(root.right))+1; 
    }
    public boolean isLeaf(TreeNode root){
    	if(root.left==null&&root.right==null)
    		return true;
    	return false;
    }
}
