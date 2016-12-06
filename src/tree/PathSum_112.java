package tree;

public class PathSum_112 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root==null){
    		return false;
    	}
        return searchSum(root, sum, 0);
    }
    public boolean searchSum(TreeNode root,int sum,int count){
    	if(root==null){
    			return false;
    	}
    	int mcount=count+root.val;
    	if(isLeaf(root)&&sum==mcount)
    		return true;
    	return searchSum(root.left, sum, mcount)||searchSum(root.right, sum, mcount);
    }
    public boolean isLeaf(TreeNode root){
    	if(root.left==null&&root.right==null)
    		return true;
    	
    	return false;
    }
}
