package programmers_Lv2;

import java.util.Arrays;

public class TableHashFunction {
//	https://school.programmers.co.kr/learn/courses/30/lessons/147354
	public static void main(String[] args) {
		int[][] data = {{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}};
		int col = 2;
		int row_begin = 2;
		int row_end = 3;
		int answer = 0;
		
		Arrays.sort(data, (s1, s2) -> s1[col-1]!=s2[col-1] ? s1[col-1] - s2[col-1] : s2[0] - s1[0]);

		for(int i=row_begin; i<=row_end; i++) {
			int[] dt = data[i-1];
			int add = 0;
		
			for(int d : dt) {
				add += d%i;
			}
		
			answer ^= add;
		}
		
		System.out.println(answer);
	}

}
