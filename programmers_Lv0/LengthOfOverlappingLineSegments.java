package programmers_Lv0;

import java.util.HashMap;
import java.util.Map;

public class LengthOfOverlappingLineSegments {

	public static void main(String[] args) {
		int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0]; j < lines[i][1]; j++) {
				map.put(j, map.getOrDefault(j, 0) + 1);
			}
		}

		for (int k : map.keySet()) {
			if (map.get(k) > 1) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}
