import java.util.LinkedList;
import java.util.Queue;

public class SumNodesInBinaryTree {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(10);
		root.left.right = new TreeNode(12);
		
		System.out.println(sumNodesInBinaryTreeIterative(root) + " " + sumNodesInBinaryTreeRecursive(root));
	}
	
	public static int sumNodesInBinaryTreeIterative(TreeNode root){
		int total = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		while(!queue.isEmpty()){
			TreeNode cur = queue.poll();
			total += cur.val;
			if(cur.left != null)
				queue.offer(cur.left);
			if(cur.right != null)
				queue.offer(cur.right);
		}
		return total;
	}
	
	public static int sumNodesInBinaryTreeRecursive(TreeNode root){
		if(root == null)
			return 0;
		else
			return root.val + sumNodesInBinaryTreeRecursive(root.left) + sumNodesInBinaryTreeRecursive(root.right);
	}
}
