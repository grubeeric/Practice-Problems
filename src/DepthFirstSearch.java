import java.util.Stack;

public class DepthFirstSearch {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean depthFirstSearchRecursive(TreeNode root, int target) {
		if (root == null)
			return false;
		else if (root.val == target)
			return true;
		else
			return depthFirstSearchRecursive(root.left, target) || depthFirstSearchRecursive(root.right, target);
	}

	public boolean depthFirstSearchIterative(TreeNode root, int target) {
		if (root == null)
			return false;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode current = stack.pop();
			if (current.val == target){
				return true;
			}
			if (current.right != null){
				stack.push(current.right);
			}
			if (current.left != null){
				stack.push(current.left);
			}
		}
		return false;
	}
}
