/*
 *Given a circuit of gas pickup stations and the cost to travel between stations, 
 *return the index to start at to get through all the stations without running out of gas
 *
 * ex: gas[] = {1, 2, 3, 4, 5}
 *     cost[] = {1, 3, 2, 4, 5}
 *     
 *     would return '2', as that index is the first station you could start at
 *     and make it through all of the stations without running out of gas
 */

public class GasStationCircuit {
	
	public int canCompleteCircuit(int[] gas, int[] cost){
		int gasLeft = 0;
		int totalGas = 0;
		int start = 0;
		
		for(int i = 0; i < gas.length; i++){
			int remaining = gas[i] - cost[i];
			
			if(gasLeft >= 0){
				gasLeft += remaining;
			}else{
				gasLeft = remaining;
				start = i;
			}
			
			totalGas += remaining;
		}
		
		if(totalGas >= 0){
			return start;
		}else{
			return -1;
		}
	}
	
}
