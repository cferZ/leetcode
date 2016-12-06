package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import tree.SumofLeftLeaves_404.TreeNode;

public class BinaryTreePaths_257 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	static HashSet<String> result;
    public List<String> binaryTreePaths(TreeNode root) {
        result=new HashSet<>();
        travel(root,"");  	
    	return new ArrayList(result);
    }
    public void travel(TreeNode node,String path){
    	if(node==null){
    		return;
    	}
    	String npath=path+node.val;
    	if(node.left==null&&node.right==null)
    		result.add(npath);
    	else
    		npath+="->";
    	if(node.left!=null){
    		
    		travel(node.left,npath);
    	}
    	if(node.right!=null){
    		travel(node.right,npath);
    	}
    	
    }

}
