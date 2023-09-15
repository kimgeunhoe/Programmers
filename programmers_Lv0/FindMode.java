package programmers_Lv0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMode {
//	https://school.programmers.co.kr/learn/courses/30/lessons/120812
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2};
//		int[] array = {1, 2, 3, 3, 3, 4};
	    int answer = 0;
	    int max = 0;
	    boolean check = true;
	    Map<Integer, Integer> map = new HashMap<>();
	    Set<Integer> set = new HashSet<>();
	    
	    for(int a : array) {
	    	map.put(a, map.getOrDefault(a, 0) + 1);
	    	set.add(a);
	    }
	    
	    for(int s : set) {
	    	if(max==map.get(s)) {
	    		check = false;
	    	} else if(max<map.get(s)) {
	    		max = map.get(s);
	    		answer = s;
	    		check = true;
	    	}
	    }
	    
	    System.out.println(check ? answer : -1);
	}

}
