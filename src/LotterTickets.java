
public class LotterTickets {

	public static void main(String[] args){
		System.out.println(isWinningTicket(04103));
	}
	
	public static boolean isWinningTicket(int num){
		int[] arr = new int[6];
		
		for(int i = 0; i < 6; i++){
			if(num == 0)
				arr[i] = 0;
			else
				arr[i] = num % 10;
			num /= 10;
		}
		
		int firstThree = 0;
		
		for(int i = 0; i < 3; i++){
			firstThree += arr[i];
		}
		
		int lastThree = 0;
		
		for(int i = 3; i < 6; i++){
			lastThree += arr[i];
		}
		
		if(firstThree == lastThree)
			return true;
		else
			return false;
	}
	
}
