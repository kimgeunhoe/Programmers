package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compression {

	public static void main(String[] args) {
		// String msg = "KAKAO";
		String msg = "TOBEORNOTTOBEORTOBEORNOT";
		int[] answer = {};
//		String w = String.valueOf(msg.charAt(0));
//		String c = "";
		Map<String, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int index = 27;
		int num = 0;
		char w = msg.charAt(0);
		char c = ' ';
		StringBuilder sb = new StringBuilder(String.valueOf(w));

		for (int i = 0; i < msg.length(); i++) {
			c = i < msg.length() - 1 ? msg.charAt(i + 1) : ' ';
			sb.append(c);

			if (!map.containsKey(sb.toString())) {
				map.put(sb.toString(), index++);
				sb.setLength(sb.length() - 1);
				num = sb.length() == 1 ? w - 64 : map.get(sb.toString());
				w = c;
				sb.setLength(0);
				sb.append(w);
				list.add(num);
			}
		}

		answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		System.out.println(Arrays.toString(answer));
	}

}
