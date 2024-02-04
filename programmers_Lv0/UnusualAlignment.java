package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnusualAlignment {

	public static void main(String[] args) {
		int[] numlist = {1, 2, 3, 4, 5, 6};
		int n = 4;
		int[] answer = new int[numlist.length];
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		List<Integer> list;
		List<Integer> key;
		int index = 0;

		for (int nl : numlist) {
			map.put(nl, Math.abs(nl - n));
			set.add(Math.abs(nl - n));
		}

		list = new ArrayList<>(set);
		key = new ArrayList<>(map.keySet());

		Collections.sort(list);
		Collections.sort(key, Collections.reverseOrder());

		for (int l : list) {
			for (int j = 0; j < key.size(); j++) {
				if (map.get(key.get(j)) == l) {
					answer[index++] = key.get(j);
					key.remove(j--);
				}
			}
		}

		System.out.println(Arrays.toString(answer));
	}

}
