import java.util.HashMap;


public class ConstructBinaryTreefromPreorderandInorderTraversal_105 {


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
    	TreeNode tree=buildPreTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);
    	return tree;
    }
    public TreeNode buildPreTree(int[] inorder,int istart,int iend,int[] preorder,int pstart,int pend){
    	if(pend<pstart||pend<0||pstart<0){
    		return null;
    	}
    	else if(pend==pstart){
    		System.out.println( "eeee "+preorder[pend]);
    		return new TreeNode(preorder[pend]);
    	}
    	HashMap<Integer, Integer> map=buildInOrder(inorder,istart,iend);
    	System.out.println("start : "+pstart+" end : "+pend);
    	int rootElement=preorder[pstart];
    	System.out.println(rootElement);
    	int rootPos=map.get(rootElement);
    	TreeNode root=new TreeNode(rootElement);
    	TreeNode left=buildPreTree(inorder,istart,istart+rootPos-1,preorder,pstart+1,pstart+rootPos);
    	TreeNode right=buildPreTree(inorder,istart+rootPos+1,iend,preorder,pstart+rootPos+1,pend);
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
    	int[] preorder={1,2,4,5,3,6};
    	ConstructBinaryTreefromPreorderandInorderTraversal_105 t=new ConstructBinaryTreefromPreorderandInorderTraversal_105();
    	t.buildTree(inorder, preorder);
    }

}
