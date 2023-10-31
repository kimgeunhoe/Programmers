package programmers_Lv0;

import java.util.Arrays;

public class NumberOfCharactersCount {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181902
	public static void main(String[] args) {
		String my_string = "Programmers";
		int[] answer = new int[52];
		        
		for(char m : my_string.toCharArray()) {
			answer[m - (m<=90 ? 65 : 71)]++;
		}

		System.out.println(Arrays.toString(answer));
	}

}
