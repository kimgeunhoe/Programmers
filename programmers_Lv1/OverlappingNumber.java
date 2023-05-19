package programmers_Lv1;

import java.util.ArrayList;
import java.util.List;

public class OverlappingNumber {

	public static void main(String[] args) {
		int []arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = {};
		List<Integer> num = new ArrayList<>();
		int index = 0;
		
		num.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				num.add(arr[i]);
			}
		}
		
		answer = new int[num.size()];
		
		for(int n : num) {
			answer[index++] = n;
		}

		for(int a : answer) {
			System.out.println(a);
		}
	}

}
