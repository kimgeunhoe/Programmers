package programmers_Lv0;

import java.util.Arrays;

public class AddOfFractions {
//	https://school.programmers.co.kr/learn/courses/30/lessons/120808
	public static void main(String[] args) {
		int numer1 = 1;
		int denom1 = 2;
		int numer2 = 3;
		int denom2 = 4;
		int[] answer = new int[] {numer1 * denom2 + numer2 * denom1, denom1*denom2};
        
        for(int min = Math.min(answer[0], answer[1]); min>1; min--) {
	    	if(answer[0]%min==0 && answer[1]%min==0) {
	    		answer[0] /= min;
	    		answer[1] /= min;
	    		break;
	    	}
	    }
		
        System.out.println(Arrays.toString(answer));
	}
}
