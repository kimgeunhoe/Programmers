package programmers_Lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PickATangerine {
//	https://school.programmers.co.kr/learn/courses/30/lessons/138476
	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();
		int[] size = {};
		int index = 0;
		
		for(int t : tangerine) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}
		
		size = new int[map.size()];
		
		for(int ks : map.keySet()) {
			size[index++] = map.get(ks);
		}
		
		Arrays.sort(size);

		index = 0;
		
		for(int i=size.length-1; i>=0 && index<k; i--) {
			index += size[i];
			answer++;
		}
		
		System.out.println(answer);
	}

}
