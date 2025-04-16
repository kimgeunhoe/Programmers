package programmers_Lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tuple {
//	https://school.programmers.co.kr/learn/courses/30/lessons/64065
	public static void main(String[] args) {
//		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		String s = "{{20,111},{111}}";
		int[] answer = {};
		String[] arr = s.substring(2, s.length()-2).split("\\},\\{");
		Map<Integer, String[]> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		int size = arr.length;
		int index = 0;
		
		for(String a : arr) {
			String[] mapArr = a.split(",");
			map.put(mapArr.length, mapArr);
		}

		answer = new int[size];

		for(int i=1; i<=size; i++) {
			for(String a : map.get(i)) {
				if(set.add(a)) {
					answer[index++] = Integer.parseInt(a);
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
