
public class BinarySearch {

	public static void main(String[] args){
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		System.out.println(binarySearch(nums, 12));
	}
	
	public static boolean binarySearch(int[] nums, int target){
		int low = 0;
		int hi = nums.length-1;
		
		while(low <= hi){
			int mid = (low + hi)/2;
			if(nums[mid] == target)
				return true;
			else if(nums[mid] > target)
				hi = mid - 1;
			else
				low = mid + 1;
		}
		
		return false;
	}
	
}
