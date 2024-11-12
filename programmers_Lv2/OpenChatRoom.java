 package programmers_Lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChatRoom {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42888
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer = {};
		Map<String, String> map = new HashMap<>();
		String[] arr = {};
		int length = record.length;
		int index = 0;
		
		for(String r : record) {
			arr = r.split(" ");
			
			if(!"Leave".equals(arr[0])) {
				map.put(arr[1], arr[2]);
				
				if("Change".equals(arr[0])) {
					length--;
				}
			}
		}
		
		answer = new String[length];
		
		for(String r : record) {
			arr = r.split(" ");
			
			if(!"Change".equals(arr[0])) {
				answer[index++] = new StringBuilder(map.get(arr[1])).append("님이 ").append("Enter".equals(arr[0]) ? "들어왔" : "나갔").append("습니다.").toString();
			}
		}

		System.out.println(Arrays.toString(answer));
	}

}
