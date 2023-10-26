package programmers_Lv0;

import java.util.Arrays;

public class NSpacedElements {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181888
	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		int[] answer = new int[(num_list.length-1)/n + 1];
		        
		for(int i=0; i<answer.length; i++) {
			answer[i] = num_list[i*n];
		}
		        
		System.out.println(Arrays.toString(answer));
	}

}
