package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NearestSameLetterClosestTo {

	public static void main(String[] args) {
		String s = "banana";
		int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
        	answer[i] = i - map.getOrDefault(s.charAt(i), i+1);
        	map.put(s.charAt(i), i);
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
