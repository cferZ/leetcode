package tree;

public class SumofLeftLeaves_404 {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	 static int result=0;
    public int sumOfLeftLeaves(TreeNode root) {
        result=0;
        
        travel(root);
             
        return result;
    }
    public void travel(TreeNode node){
    	if(node==null){
    		return;
    	}
    	if(node.left!=null){
    		if(node.left.left==null&&node.left.right==null){
    			result+=node.left.val;
    		}
    		else
    			travel(node.left);
    	}
    	if(node.right!=null)
    		travel(node.right);
    }

}
