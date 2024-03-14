package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReceiveReportResults {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
        int[] answer = new int[id_list.length];
        Map<String, Integer> user = new HashMap<>();
        Map<String, Set<String>> map = new HashMap<>();
        String[] reportArr = {"", ""};

        for(int i=0; i<id_list.length; i++) {
        	user.put(id_list[i], i);
        }
        
        for(String r : report) {
        	reportArr = r.split(" ");
        	
        	if(!map.containsKey(reportArr[1])) {
        		map.put(reportArr[1], new HashSet<String>());
        	}
        	
        	map.get(reportArr[1]).add(reportArr[0]);
        }
        
        for(int i=0; i<id_list.length; i++) {
        	if(map.containsKey(id_list[i]) && map.get(id_list[i]).size()>=k) {
        		for(String m : map.get(id_list[i])) {
        			answer[user.get(m)]++;
        		}
        	}
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
