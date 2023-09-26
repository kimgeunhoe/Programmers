package programmers_Lv0;

import java.util.Arrays;

public class HateOdd {
//	https://school.programmers.co.kr/learn/courses/30/lessons/120813
	public static void main(String[] args) {
		int n = 11;
        int[] answer = new int[n/2 + (n%2==0 ? 0 : 1)];
        	
        for(int i=0, num = 1; num<=n; answer[i++]=num, num+=2);
        
        System.out.println(Arrays.toString(answer));
	}

}
