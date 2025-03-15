package programmers_Lv2;

import java.util.HashMap;
import java.util.Map;

public class VowelDictionary {
//	https://school.programmers.co.kr/learn/courses/30/lessons/84512
	//dfs로 풀이해보기
	public static void main(String[] args) {
		String word = "AAAAE";
		int length = word.length();
		int answer = length;
		//5^0 -> 5^1 + 1 -> 5^2 + 6 ->.....
		int[] increase = {781, 156, 31, 6, 1};
//		Map<Character, Integer> map = Map.of(
//				'A', 0,
//				'E', 1,
//				'I', 2,
//				'O', 3,
//				'U', 4
//		);
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('A', 0);
		map.put('E', 1);
		map.put('I', 2);
		map.put('O', 3);
		map.put('U', 4);
		
		for(int i=0; i<length; i++) {
			answer += increase[i] * map.get(word.charAt(i));
		}
		
		System.out.println(answer);
	}

}
