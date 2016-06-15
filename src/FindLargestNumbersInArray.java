import java.util.PriorityQueue;

public class FindLargestNumbersInArray {

	public static void main(String[] args){
		int[] nums = {9, 8, 1, 4, 3, 2, 6, 7, 10, 12, 14, 22};
		PriorityQueue<Integer> queue = findKLargestNumbersInArray(nums, 5);
		
		while(!queue.isEmpty()){
			System.out.print(queue.poll() + " ");
		}
	}
	
	public static PriorityQueue<Integer> findKLargestNumbersInArray(int[] nums, int k){
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i = 0; i < nums.length; i++){
			if(queue.size() < k){
				queue.offer(nums[i]);
			}else{
				if(nums[i] >= queue.peek()){
					queue.poll();
					queue.offer(nums[i]);
				}
			}
		}
		
		return queue;
	}
	
}
