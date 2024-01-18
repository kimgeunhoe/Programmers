package programmers_Lv0;

import java.util.HashMap;
import java.util.Map;

public class TieString {

	public static void main(String[] args) {
		String[] strArr = {"a","bc","d","efg","hi"};
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(String s : strArr) {
			map.put(s.length(), map.getOrDefault(s.length(), 0) + 1);
		}
		
		for(int k : map.keySet()) {
			answer = Math.max(answer, map.get(k));
		}
		        
		System.out.println(answer);
	}

}
