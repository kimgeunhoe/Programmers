package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryScore {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		int[] answer = new int[photo.length];
        Map<String, Integer> point = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
        	point.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
        	for(int j=0; j<photo[i].length; j++) {
        		answer[i] += point.getOrDefault(photo[i][j], 0);
        	}
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
