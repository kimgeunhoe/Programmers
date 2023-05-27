package programmers_Lv1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReceiveReporRresults {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		int[] result = new int[id_list.length];
		
		Map<String, Integer> user = new HashMap<>();
		Map<String, Set<String>> map = new HashMap<>();
		
		for(int i=0; i<id_list.length; i++) {
			user.put(id_list[i], i);
			map.put(id_list[i], new HashSet<>());
		}
		
		for(String r : report) {
			String[] id = r.split(" ");
			map.get(id[1]).add(id[0]);
		}
		
		for(int i=0; i<id_list.length; i++) {
			Set<String> receive = map.get(id_list[i]);
			if(receive.size() >= k) {
				for(String id : receive) {
					result[user.get(id)]++;
				}
			}
		}
		
		for(int i : result) {
			System.out.print(i);
		}
	}

}
