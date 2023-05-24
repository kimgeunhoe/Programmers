package programmers_Lv1;

import java.util.HashSet;
import java.util.Set;

public class Pocketmon {

	public static void main(String[] args) {
		int[] nums = {3, 1, 2, 3};
		int answer = 0;
		Set<Integer> set = new HashSet<>();
		
		for(int n : nums) {
			set.add(n);
		}
		
		if(nums.length/2<set.size()) {
			answer = nums.length/2;
		} else {
			answer = set.size();
		}
		
		System.out.println(answer);
	}

}
