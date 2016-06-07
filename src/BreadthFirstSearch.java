import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x){
			val = x;
		}
	}
	
	public boolean breadthFirstSearch(TreeNode root, int target){
		if(root == null)
			return false;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			if(node.val == target){
				return true;
			}
			else{
				if(node.left != null)
					queue.offer(node.left);
				if(node.right != null)
					queue.offer(node.right);
			}
		}
		
		return false;
	}
}
