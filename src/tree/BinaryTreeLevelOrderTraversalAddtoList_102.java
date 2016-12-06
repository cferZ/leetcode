package tree;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalAddtoList_102 {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	static List<List<Integer>> result;
	public List<List<Integer>> levelOrder(TreeNode root) {
        result=new ArrayList<List<Integer>>(); 
		if(root!=null){
			List<Integer> level=new ArrayList<>();
			level.add(root.val);
        	 result.add(level);
        	 List<TreeNode> list=new ArrayList<>();
        	 if(root.left!=null)
        		 list.add(root.left);
        	 if(root.right!=null)
        		 list.add(root.right);
        	 if(list.size()>0)
        	 	 readNextLevel(list);
        }
		return result;
    }
	public void readNextLevel(List<TreeNode> list){
		List<Integer> level=new ArrayList<>();
		List<TreeNode> nextLevel=new ArrayList<>();
		for(TreeNode node:list){
			level.add(node.val);
			if(node.left!=null)
				nextLevel.add(node.left);
			if(node.right!=null)
				nextLevel.add(node.right);
		}
		result.add(level);
		if(nextLevel.size()>0)
			readNextLevel(nextLevel);
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		List<List<Integer>> result=new BinaryTreeLevelOrderTraversalAddtoList_102().levelOrder(root);
		for(List<Integer> list:result){
			for(int i:list){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
