
public class GeneratePermutations {

	public static void main(String[] args){
		generatePermutation("abcd");
	}
	
	public static void generatePermutation(String str){
		generatePermutation("", str);
	}
	
	public static void generatePermutation(String prefix, String str){
		int n = str.length();
		if(n == 0) System.out.println(prefix);
		else{
			for(int i = 0; i < n; i++){
				generatePermutation(prefix +str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}
	
}
