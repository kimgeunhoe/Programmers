package programmers_Lv0;

import java.util.Arrays;

public class LastTwoElements {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181927
	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int length = num_list.length;
		int[] answer = new int[length+1];
		int diff = num_list[length-1] - num_list[length-2];
		
		System.arraycopy(num_list, 0, answer, 0, length);
		
		answer[length] = diff>0 ? diff : answer[length-1] * 2;

		System.out.println(Arrays.toString(answer));
	}

}
