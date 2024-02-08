package programmers_Lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class AddSelectedTwoNumber {

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		int[] answer = {};
		Set<Integer> set = new HashSet<>();
//		Set<Integer> set = new TreeSet<>(); //자동 정렬됨.
		int index = 0;
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		
		answer = new int[set.size()];
		
		for(int s : set) {
			answer[index++] = s;
		}
		
		Arrays.sort(answer);

		System.out.println(Arrays.toString(answer));
	}

}
