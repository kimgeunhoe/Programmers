package programmers_Lv0;

import java.util.Arrays;

public class CreateArray1 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181901
	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int[] answer = new int[n/k];
		        
		for(int i=0; i<answer.length; answer[i]=++i*k);

		System.out.println(Arrays.toString(answer));
	}

}
