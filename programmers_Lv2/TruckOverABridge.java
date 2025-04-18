package programmers_Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class TruckOverABridge {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};

		int answer = bridge_length;
	    int sum = 0;
	    int index = 0;
	    Queue<Integer> q = new LinkedList<>();

	    for(int i=0; i<bridge_length; i++) {
	    	q.add(0);
	    }

	    while(index<truck_weights.length) {
	    	sum -= q.poll();
	    	answer++;
	    	
	    	if(sum+truck_weights[index]<=weight) {
	    		sum += truck_weights[index];
	    		q.add(truck_weights[index++]);
	    	} else {
	    		q.add(0);
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
