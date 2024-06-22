package programmers_Lv2;

import java.util.HashMap;
import java.util.Map;

public class Clothes {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42578
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
	    int answer = 1;
	    Map<String, Integer> map = new HashMap<>();
	    
	    for(String[] c : clothes) {
	    	map.put(c[1], map.getOrDefault(c[1], 0) + 1);
	    }
	    
	    for(String k : map.keySet()) {
	    	answer *= map.get(k)+1;
	    }

	    System.out.println(answer - 1);
	}

}
