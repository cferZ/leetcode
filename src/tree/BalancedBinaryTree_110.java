package tree;


public class BalancedBinaryTree_110 {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public boolean isBalanced(TreeNode root) {
    	if(root==null)
    		return true;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if(left>=0&&right>=0&&Math.abs(left-right)<2)
    		return true;
        else 
        	return false;
    }
    public int getDepth(TreeNode root){
    	if(root==null)
    		return 0;
    	int left=getDepth(root.left);
    	int right=getDepth(root.right);
    	if(left>=0&&right>=0&&Math.abs(left-right)<2)
    		return Math.max(left, right)+1;
    	else
    		return -1;
    }
}
