
public class Fibonacci {
	
	public static void main(String[] args){
		System.out.println(fibRec(8) + " " + fibIterative(8));
	}

	public static int fibRec(int n){
		if (n <= 1) return n;
        else return fibRec(n-1) + fibRec(n-2);
	}
	
	public static int fibIterative(int n){
		if(n < 2)
			return n;
		int cur = 1;
		int prev = 1;
		int preprev = 0;
		
		for(int i = 2; i <= n; i++){
			cur = prev + preprev;
			preprev = prev;
			prev = cur;
		}
		
		return cur;
	}
}
