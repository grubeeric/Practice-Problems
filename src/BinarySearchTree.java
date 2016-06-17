import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	public TreeNode root;

	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
			left = null;
			right = null;
		}
	}
	
	public static void main(String[] args){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(30);
		bst.insert(25);
		bst.insert(38);
		bst.insert(18);
		bst.insert(27);
		bst.insert(33);
		bst.insert(42);
		bst.insert(39);
		bst.printTree(bst.root);
	}
	
	public  boolean find(int target){
		TreeNode current = root;
		while(current != null){
			if(current.val == target)
				return true;
			else if(current.val > target)
				current = current.left;
			else
				current = current.right;
		}
		return false;
	}
	
	public void insert(int value){
		TreeNode newNode = new TreeNode(value);
		if(root == null){
			root = newNode;
			return;
		}
		TreeNode current = root;
		TreeNode parent = null;
		while(true){
			parent = current;
			if(value < current.val){
				current = current.left;
				if(current == null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current == null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public void delete(int value){
		TreeNode current = root;
		TreeNode parent = null;
		boolean isLeftChild = false;
		while(current.val != value){
			parent = current;
			if(current.val > value){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		
		if(current.left == null && current.right == null){
			if(current == root){
				root = null;
			}
			if(isLeftChild){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		
		else if(current.right == null){
			if(current == root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		
		else if(current.left == null){
			if(current == root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}
		
		else if(current.left != null && current.right != null){
			TreeNode successor = getSuccessor(current);
			if(current == root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}
			successor.left = current.left;
		}
	}
	
	public TreeNode getSuccessor(TreeNode deleteNode){
		TreeNode successsor =null;
		TreeNode successsorParent =null;
		TreeNode current = deleteNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}

		if(successsor!=deleteNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleteNode.right;
		}
		return successsor;
	}
	
	public void printTree(TreeNode root){
		Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
		Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
		currentLevel.offer(root);
		
		while(!currentLevel.isEmpty()){
			TreeNode cur = currentLevel.poll();
			System.out.print(cur.val + " ");
			if(cur.left != null)
				nextLevel.offer(cur.left);
			if(cur.right != null)
				nextLevel.offer(cur.right);
			
			if(currentLevel.isEmpty()){
				System.out.println();
				currentLevel = nextLevel;
				nextLevel = new LinkedList<TreeNode>();
			}
		}
	}
}
