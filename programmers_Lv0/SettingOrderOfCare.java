package programmers_Lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SettingOrderOfCare {
//	/https://school.programmers.co.kr/learn/courses/30/lessons/120835
	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100};
//		int[] emergency = {3, 76, 24};
	    int[] answer = emergency.clone();
	    int length = answer.length;
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    Arrays.sort(answer);
	    
	    for(int i=0; i<length; i++) {
	    	map.put(answer[i], length - i);
	    }
	    
	    for(int i=0; i<length; i++) {
	    	answer[i] = map.get(emergency[i]);
	    	System.out.println(answer[i]);
	    }
	}

}
