package programmers_Lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DrawOfKNumbers {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 2, 2, 3};
		int k = 3;
		int[] answer = new int[k];
		Set<Integer> set = new HashSet<>();
		int index = 0;
		
		Arrays.fill(answer, -1);
		
		for(int a : arr) {
			if(set.add(a)) {
				answer[index++] = a;
				
				if(index==k) {
					break;
				}
			}
		}

		System.out.println(Arrays.toString(answer));
	}

}
