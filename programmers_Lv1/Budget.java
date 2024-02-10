package programmers_Lv1;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
        int answer = 0;
        
        Arrays.sort(d);
        
        for(; answer<d.length && budget>=d[answer]; answer++) {
        	budget -= d[answer];
        }
        
        System.out.println(answer);
	}

}
