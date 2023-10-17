package programmers_Lv0;

import java.util.Arrays;

public class Manipulate2 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181925
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
		int temp = 0;
		        
		for(int[] q : queries) {
			temp = arr[q[1]];
			arr[q[1]] = arr[q[0]];
			arr[q[0]] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}

}
