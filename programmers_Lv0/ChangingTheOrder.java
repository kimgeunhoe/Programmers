package programmers_Lv0;

import java.util.Arrays;

public class ChangingTheOrder {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181891
	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int n = 1;
		int length = num_list.length;
		int[] answer = new int[length];
		
		for(int i=0; i<length; n++, i++) {
			answer[i] = num_list[n%length];
		}
		        
		System.out.println(Arrays.toString(answer));
	}

}
