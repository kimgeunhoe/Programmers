package programmers_Lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CutRollCake {

	public static void main(String[] args) {
//		int[] topping = {1, 2, 3, 1, 4};
		int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        int answer = 0;
        
        Set<Integer> chuelsu = new HashSet<>();
        Set<Integer> brother = new HashSet<>();
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int t : topping) {
        	chuelsu.add(t);
        	count.put(t, count.getOrDefault(t, 0) + 1);
        }
        
        for(int t : topping) {
        	brother.add(t);
        	count.put(t, count.get(t) - 1);
        	
        	if(count.get(t)==0) {
        		chuelsu.remove(t);
        	}
        	
        	if(chuelsu.size()==brother.size()) {
        		answer++;
        	} else if(chuelsu.size()<brother.size()) {
        		break;
        	}
        }
        
        System.out.println(answer);
	}

}
