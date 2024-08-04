package programmers_Lv2;

import java.util.Arrays;

public class FindTheBigNumberInTheBack {
//	https://school.programmers.co.kr/learn/courses/30/lessons/154539
	public static void main(String[] args) {
		int[] numbers = {2, 3, 3, 5};
		int length = numbers.length;
		int[] answer = new int[length];

		l : for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(numbers[i]<numbers[j]) {
					answer[i] = numbers[j];
					continue l;
				}
			}
			
			answer[i] = -1;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
