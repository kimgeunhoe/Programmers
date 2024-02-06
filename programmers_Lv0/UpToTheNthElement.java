package programmers_Lv0;

import java.util.Arrays;

public class UpToTheNthElement {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181889
	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int n = 1;
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(num_list, 0, n)));
	}

}
