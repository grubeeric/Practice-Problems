
public class BTLowestCommonAncestor {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(11);
		root.right = new TreeNode(12);
		root.left.left = new TreeNode(8);
		root.right.right = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(3);
		
		System.out.println(lowestCommonAncestor(root, root.left.left, root.left.right).val);
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null) {
			return root;
		}
		if (left != null) {
			return left;
		} else {
			return right;
		}
	}
}
