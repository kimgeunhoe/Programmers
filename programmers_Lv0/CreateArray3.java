package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray3 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181895
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[][] intervals = {{1, 3}, {0, 4}};
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		
		for(int[] i : intervals) {
			for(int j=i[0]; j<=i[1]; j++) {
				list.add(arr[j]);
			}
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<list.size(); answer[i]=list.get(i++));
		
		System.out.println(Arrays.toString(answer));
	}

}
