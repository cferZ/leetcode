package tree;

public class InvertBinaryTree_226 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        	return null;
    	invertTree(root.left);
        invertTree(root.right);
    	TreeNode tem=root.left;
    	root.left=root.right;
    	root.right=tem;
    	return root;
    }

}
