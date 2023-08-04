package programmers_Lv0;

import java.util.Arrays;

public class Countdown {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181899
	public static void main(String[] args) {
		int start = 10;
		int end = 3;
		int[] answer = new int[start-end+1];
		        
		for(int index=0; start>=end; answer[index++]=start--);

		System.out.println(Arrays.toString(answer));
	}

}
