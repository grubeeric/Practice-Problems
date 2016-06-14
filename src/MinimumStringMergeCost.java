import java.util.PriorityQueue;

/*
 * Suppose there is a function that concatenates two strings and returns the length of the resultant string.
 * When called upon a series of string, how do we minimize the cost of using this function.
 * Let's say we have 3 strings, A="abc", B="def", C="gh"
 * Now, the cost of merging AB = 6 and the cost of merging the resultant string with C is 8.
 * Thus the total cost is 6 + 8 = 14.
 * However, if we merge A and C first, then the cost is 5. Then the merge with B is 8, so the total is 8 + 5 = 13.
 * Write an algorithm that minimizes the cost of adding such a series of strings
 */
public class MinimumStringMergeCost {

	public static void main(String[] args){
		String[] arr = {"abc", "def", "gh", "k", "irudk"};
		
		System.out.println(minStringMergeCost(arr));
	}
	
	public static int minStringMergeCost(String[] arr){
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int totalCost = 0;
		
		for(String s : arr){
			minHeap.offer(s.length());
		}
		
		while(!minHeap.isEmpty()){
			if(minHeap.size() == 1){
				return totalCost;
			}
			int minOne = minHeap.poll();
			int minTwo = minHeap.poll();
			int newLength = minOne + minTwo;
			totalCost += newLength;
			minHeap.offer(newLength);
		}
		
		return totalCost;
	}
	
}
