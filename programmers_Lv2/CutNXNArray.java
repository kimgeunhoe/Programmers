package programmers_Lv2;

import java.util.Arrays;

public class CutNXNArray {
//	https://school.programmers.co.kr/learn/courses/30/lessons/87390
	public static void main(String[] args) {
		int n = 3;
		long left = 2;
		long right = 5;
		int[] answer = new int[(int)(right - left) + 1];
		int index = 0;
		int x = (int)(left/n);
		int y = (int)(left%n);

		for(long i=left; i<=right; i++) {
			answer[index++] = (x>=y ? x : y) + 1;

			if(y==n-1) {
				y = 0;
				x++;
			} else {
				y++;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
