
public class MirrorBinaryTree {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public void reverseTree(TreeNode root){
		if(root == null)
			return;
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;
		
		reverseTree(root.right);
		reverseTree(root.left);
	}
}
