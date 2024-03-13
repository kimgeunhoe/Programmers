package programmers_Lv1;

import java.util.HashSet;
import java.util.Set;

public class Ponketmon {

	public static void main(String[] args) {
		int[] nums = {3, 1, 2, 3};
		Set<Integer> set = new HashSet<>();
        
        for(int n : nums) {
        	set.add(n);
        }
        
        System.out.println(set.size()<nums.length/2 ? set.size() : nums.length/2);
	}

}
