package programmers_Lv0;

import java.util.Arrays;

public class QuerySequenceAndInterval1 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181883
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
		
		for(int[] q : queries) {
			for(int i=q[0]; i<=q[1]; i++) {
				arr[i]++;
			}
		}
		        
		System.out.println(Arrays.toString(arr));
	}

}
