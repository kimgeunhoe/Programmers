package programmers_Lv1;

import java.util.Arrays;

public class LottoRank {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] answer = {0, 7};
        int zero = 0;
        
        for(int l : lottos) {
        	if(l==0) {
        		zero++;
        	} else {
        		for(int w : win_nums) {
        			if(l==w) {
        				answer[1]--;
        				break;
        			}
        		}
        	}
        }
        
        answer[0] = answer[1] - zero;
        
        for(int i=0; i<answer.length; i++) {
        	if(answer[i]==7) {
        		answer[i]--;
        	}
        }
		
		System.out.print(Arrays.toString(answer));
	}

}
