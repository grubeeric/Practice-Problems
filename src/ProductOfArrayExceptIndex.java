/*
 * You have a list of integers, and for each index you want to find the product of every integer except the integer at that index.
 */

public class ProductOfArrayExceptIndex {

	public static void main(String[] args){
		int[] arr = {3, 8, 4, 6};
		int[] newArr = getProductsOfAllIntsExceptAtIndex(arr);
		for(int i : newArr)
			System.out.print(i + " ");
	}
	
	public static int[] getProductsOfAllIntsExceptAtIndex(int[] nums){
		int[] result = new int[nums.length];
		for(int i = 0; i < result.length; i++){
			result[i] = 1;
		}
		
		int product = 1;
		
		for(int i = 0; i < nums.length; i++){
			result[i] = product;
			product *= nums[i];
		}
		
		product = 1;
		
		for(int i = nums.length-1; i >= 0; i--){
			result[i] *= product;
			product *= nums[i];
		}
		
		return result;
	}
	
}
