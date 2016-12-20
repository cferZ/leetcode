package tree;

public class DeleteNodeinaBST_450 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	public TreeNode deleteNode(TreeNode root, int key) {
		if(root==null)
			return root;
        if(root.val==key){
        	root=merge(root);
        }        
        else if(root.val<key)
        	deleteNode(root,root.right,key);
        else
        	deleteNode(root,root.left,key);
        
        return root;
    }
	public void deleteNode(TreeNode parent,TreeNode node,int key){
		if(node==null)
			return;
		if(node.val==key){
			if(parent.val<key)
				parent.right=merge(node);
			else
				parent.left=merge(node);
		}
		else if(node.val<key){
			deleteNode(node,node.right,key);
		}
		else
			deleteNode(node,node.left,key);
	}
	public TreeNode merge(TreeNode node){
		TreeNode left=node.left;
		TreeNode right=node.right;
		if(left!=null){
			TreeNode result=left;
			while(left.right!=null)
				left=left.right;
			left.right=right;
			return result;
		}
		else
			return right;
	}
}
