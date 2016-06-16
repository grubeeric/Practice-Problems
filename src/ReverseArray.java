
public class ReverseArray {

	public static void main(String[] args){
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i : nums)
			System.out.print(i + " ");
		
		nums = reverseArray(nums);
		
		System.out.println();
		
		for(int i : nums)
			System.out.print(i + " ");
	}
	
	public static int[] reverseArray(int[] nums){
		for(int i = 0; i < nums.length/2; i++){
			int temp = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;
		}
		
		return nums;
	}
	
}
