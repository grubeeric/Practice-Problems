
public class RemoveDuplicatesFromArray {

	public static void main(String[] args){
		int[] array = {3, 3, 4, 5, 5, 6, 7, 7, 7};
		array = placeDuplicatesAtEndOfArray(array);
		for(int i : array)
			System.out.print(i + " ");
	}
	
	public static int[] placeDuplicatesAtEndOfArray(int[] arr){
		int i = 0;
		
		if(arr.length == 1 || arr.length == 0)
			return arr;
		
		for(int j = 1; j < arr.length; j++){
			if(arr[i] == arr[j]){
				continue;
			}
			else{
				i++;
				arr[i] = arr[j];
			}
		}
		
		return arr;
	}
	
}
