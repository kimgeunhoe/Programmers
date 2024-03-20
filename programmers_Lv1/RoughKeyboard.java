package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RoughKeyboard {

	public static void main(String[] args) {
		String[] keymap = {"ABACD", "BCEFD"};
		String[] targets = {"ABCD","AABB"};
		int[] answer = new int[targets.length];
		Map<Character, Integer> map = new HashMap<>();
		
		for(String k : keymap) {
			for(int i=0; i<k.length(); i++) {
				map.put(k.charAt(i), Math.min(i+1, map.getOrDefault(k.charAt(i), k.length())));
			}
		}
		
		for(int i=0; i<targets.length; i++) {
			for(int j=0; j<targets[i].length(); j++) {
				if(!map.containsKey(targets[i].charAt(j))) {
					answer[i] = -1;
					break;
				}
				
				answer[i] += map.get(targets[i].charAt(j));
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
