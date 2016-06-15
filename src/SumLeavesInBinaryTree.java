import java.util.LinkedList;
import java.util.Queue;

public class SumLeavesInBinaryTree {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public int sumLeaves(TreeNode root){
		int sum = 0;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		while(!queue.isEmpty()){
			TreeNode cur = queue.poll();
			if(cur.left == null && cur.right == null)
				sum += cur.val;
			else if(cur.left != null)
				queue.offer(cur.left);
			else if(cur.right != null)
				queue.offer(cur.right);
		}
		
		return sum;
	}
	
	public int sumLeavesRecursive(TreeNode root){
		if(root == null)
			return 0;
		else if(root.left == null && root.right == null)
			return root.val;
		else
			return sumLeavesRecursive(root.left) + sumLeavesRecursive(root.right);
			
	}
	
}
