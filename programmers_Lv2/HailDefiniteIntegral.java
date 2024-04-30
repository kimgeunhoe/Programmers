package programmers_Lv2;

import java.util.ArrayList;
import java.util.List;

public class HailDefiniteIntegral {

	public static void main(String[] args) {
		int k = 5;
		int[][] ranges = {{0, 0}, {0, -1}, {2, -3}, {3, -3}};
	    double[] answer = new double[ranges.length];
	    List<Integer> collatz = new ArrayList<>();
	    double[] area = {};
	    int max = 0;
	    int min = 0;
	    int index = 0;
	    
	    collatz.add(k);
	    
	    while(k!=1) {
	    	k = k%2==0 ? k/2 : k*3 + 1;
	    	collatz.add(k);
	    }

	    area = new double[collatz.size()-1];
	    
	    for(int i=0; i<collatz.size()-1; i++) {
	    	max = Math.max(collatz.get(i), collatz.get(i+1));
	    	min = Math.min(collatz.get(i), collatz.get(i+1));
	    	
	    	area[i] = (double)(max - min) / 2 + min;
	    }
	    
	    for(int i=0; i<ranges.length; i++) {
	    	if(ranges[i][0]>area.length+ranges[i][1]) {
	    		answer[index] = -1;
	    	} else {
	    		for(int j=ranges[i][0]; j<area.length+ranges[i][1]; j++) {
	    			answer[index] += area[j];
	    		}
	    	}
	    	
	    	index++;
	    }

	    for(double a : answer) {
	    	System.out.println(a);
	    }
	}

}
