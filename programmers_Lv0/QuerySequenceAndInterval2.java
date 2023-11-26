package programmers_Lv0;

import java.util.Arrays;

public class QuerySequenceAndInterval2 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181923
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
		int[] answer = new int[queries.length];
		        
		for(int q=0; q<queries.length; q++) {
			answer[q] = -1;
			
			for(int i=queries[q][0]; i<=queries[q][1]; i++) {
				if(arr[i]>queries[q][2]) {
					answer[q] = answer[q]!=-1 ? Math.min(answer[q], arr[i]) : arr[i];
				}
			}
		}

		System.out.println(Arrays.toString(answer));
	}

}
