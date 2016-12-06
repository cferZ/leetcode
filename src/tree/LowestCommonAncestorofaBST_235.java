package tree;

public class LowestCommonAncestorofaBST_235 {
	public static  class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root.val>p.val&&root.val>q.val){       	
	        	return lowestCommonAncestor(root.left, p, q);
	        }
	        else if(root.val<p.val&&root.val<q.val){
	        	return lowestCommonAncestor(root.right, p, q);
	        }
	        else
	        	return root;
	    }
    public static void main(String[] args) {
    	LowestCommonAncestorofaBST_235 t=new LowestCommonAncestorofaBST_235();
    	TreeNode root=new TreeNode(2);
    	root.right=new TreeNode(9);
    	root.right.left=new TreeNode(4);
    	root.right.right=new TreeNode(8);
    	TreeNode result=t.lowestCommonAncestor(root, new TreeNode(4), new TreeNode(4));
		System.out.println(result.val);
	}
}
