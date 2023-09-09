package programmers_Lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FactorizationOfPrimeFactorization {

	public static void main(String[] args) {
		int n = 9999;
		int[] answer = {};
	    Set<Integer> set = new HashSet<>();
	    int index = 0;

	    for(int i=2; n>1; i++) {
	    	while(n%i==0) {
	    		n /= i;
	    		set.add(i);
	    	}
	    }
	    
        answer = new int[set.size()];
        
        for(int s : set) {
        	answer[index++] = s;
        }
        
        Arrays.sort(answer);
        
        System.out.println(Arrays.toString(answer));
	}

}
