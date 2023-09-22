package programmers_Lv0;

import java.util.Arrays;

public class FragmentingAnArray {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181893
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		
		for(int i=0; i<query.length; i++) {
			if(i%2==0) {
				arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
			} else if(i%2==1) {
				arr = Arrays.copyOfRange(arr, query[i], arr.length);
			}
		}
		       
		System.out.println(Arrays.toString(arr));
	}

}
