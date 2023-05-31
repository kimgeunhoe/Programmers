package programmers_Lv1;

import java.util.HashMap;
import java.util.Map;

public class Retire {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String answer = "";
		Map<String, Integer> map = new HashMap<>();
		
		for(String p : participant) {
			map.put(p, map.getOrDefault(p, 0)+1);
		}
		
		for(String c : completion) {
			map.replace(c, map.get(c)-1);
		}
		
		for(String p : participant) {
			if(map.get(p)==1) {
				answer = p;
			}
		}
		
		System.out.println(answer);
	}

}
