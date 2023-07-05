package programmers_Lv0;

import java.util.Arrays;

public class AreaOfTwo {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181894
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 4, 5, 2, 9};
		int[] answer = {};
		int start = -1;
		int end = arr.length;
		
		for(int i=0; i<end; i++) {
			if(arr[i]==2) {
				start = i;
				break;
			}
		}
		
		if(start==-1) {
			answer = new int[] {-1};
		} else {
			for(int i=end-1; i>=start; i--) {
				if(arr[i]==2) {
					end = i + 1;
					break;
				}
			}
			
			answer = Arrays.copyOfRange(arr, start, end);
		}
		      
		System.out.println(Arrays.toString(answer));
	}

}
