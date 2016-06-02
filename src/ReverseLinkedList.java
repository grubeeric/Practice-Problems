/*
 * Reverse a singly linked list.
 */

public class ReverseLinkedList {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public ListNode reverseListIteratively(ListNode head){
		ListNode current = head;
		ListNode prev, nextNode;
		prev = null;
		
		while(current != null){
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		
		return prev;
	}
	
	public ListNode reverseListRecursively(ListNode head){
		if(head == null || head.next == null)
			return head;
		
		ListNode second = head.next;
		head.next = null;
		
		ListNode rest = reverseListRecursively(second);
		second.next = head;
		
		return rest;
	}
}
