package programmers_Lv0;

import java.util.Arrays;

public class CountUp {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181920
	public static void main(String[] args) {
		int start = 3;
		int end = 10;
		int[] answer = new int[end-start+1];
		        
		for(int i=0; i<answer.length; answer[i]=start+i++);

		System.out.println(Arrays.toString(answer));
	}

}
