package array;
import java.util.HashMap;

public class ConstructBinaryTreefromInorderandPostorderTraversal_106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
    	TreeNode tree=buildPostTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    	return tree;
    }
    public TreeNode buildPostTree(int[] inorder,int istart,int iend,int[] postorder,int pstart,int pend){
    	if(pend<pstart||pend<0||pstart<0){
    		return null;
    	}
    	else if(pend==pstart){
    		System.out.println( "eeee "+postorder[pend]);
    		return new TreeNode(postorder[pend]);
    	}
    	HashMap<Integer, Integer> map=buildInOrder(inorder,istart,iend);
    	System.out.println("start : "+pstart+" end : "+pend);
    	int rootElement=postorder[pend];
    	System.out.println(rootElement);
    	int rootPos=map.get(rootElement);
    	TreeNode root=new TreeNode(rootElement);
    	TreeNode left=buildPostTree(inorder,istart,istart+rootPos-1,postorder,pstart,pstart+rootPos-1);
    	TreeNode right=buildPostTree(inorder,istart+rootPos+1,iend,postorder,pstart+rootPos,pend-1);
    	root.left=left;
    	root.right=right;
    	return root;
    }
    public HashMap<Integer, Integer> buildInOrder(int[] inorder,int istart,int iend){
    	HashMap<Integer, Integer> map=new HashMap<>();
    	for(int i=0;i+istart<=iend;i++){
    		map.put(inorder[i+istart], i);
    	}
    	return map;
    }
    public class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args){
    	//4,2,5,1,6,3    4,5,2,6,3,1
    	int[] inorder={4,2,5,1,6,3};
    	int[] postorder={4,5,2,6,3,1};
    	ConstructBinaryTreefromInorderandPostorderTraversal_106 t=new ConstructBinaryTreefromInorderandPostorderTraversal_106();
    	t.buildTree(inorder, postorder);
    }
}
