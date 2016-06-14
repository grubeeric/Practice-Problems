
/*
 * Given an integer N, print numbers from 1 to N in lexicographic order
 * Ex: Given 25, print:
 * 1, 10, 11, 12, 13....19, 2, 20, ... 25, 3, 4, 5, 6, 7, 8, 9
 */

public class PrintNumbersLexicographic {

	public static void main(String[] args){
		printNumbersInLexicographicOrder(25, 1);
	}
	
	public static void printNumbersInLexicographicOrder(int n, int k){
		if(k > n)
			return;
		for(int i = 0; i < 10; i++){
			if(k <= n){
				System.out.print(k + " ");
				k *= 10;
				printNumbersInLexicographicOrder(n, k);
				k /= 10;
				k++;
				if(k % 10 == 0)
					return;
			}
		}
	}
	
}
