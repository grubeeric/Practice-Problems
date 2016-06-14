import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinarySearchTree {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public boolean isBinarySearchTreeRecursive(TreeNode root){
		return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean validate(TreeNode root, int min, int max){
		if(root == null)
			return true;
		if(root.val <= min || root.val >= max)
			return false;
		
		return validate(root.left, min, root.val) && validate(root.right, root.val, max);
	}
	
	public boolean isBinarySearchTreeIterative(TreeNode root){
		if(root == null)
			return true;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode cur = queue.poll();
			if(cur.val <= cur.left.val || cur.val >= cur.right.val)
				return false;
			if(cur.left != null)
				queue.offer(cur.left);
			if(cur.right != null)
				queue.offer(cur.right);
		}
		return true;
	}
	
}
