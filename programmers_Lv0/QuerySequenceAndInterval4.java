package programmers_Lv0;

import java.util.Arrays;

public class QuerySequenceAndInterval4 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181922
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
		        
		for(int[] q : queries) {
			for(int i=q[0]; i<=q[1]; i++) {
				if(i%q[2]==0) {
					arr[i]++;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
