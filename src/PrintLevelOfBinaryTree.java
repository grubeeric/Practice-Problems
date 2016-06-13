import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOfBinaryTree {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		root.right = right;
		TreeNode left = new TreeNode(2);
		root.left = left;
		
		printLevelOfBinaryTree(root, 2);
	}

	public static void printLevelOfBinaryTree(TreeNode root, int level){
		Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
		Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
		
		currentLevel.offer(root);
		int curLevel = 1;
		
		while(!currentLevel.isEmpty()){
			TreeNode node = currentLevel.poll();
			if(curLevel == level){
				System.out.print(node.val + " ");
			}
			
			if(node.left != null)
				nextLevel.offer(node.left);
			if(node.right != null)
				nextLevel.offer(node.right);
			
			if(currentLevel.isEmpty()){
				currentLevel = nextLevel;
				nextLevel = new LinkedList<TreeNode>();
				curLevel++;
			}
		}
	}
	
}
