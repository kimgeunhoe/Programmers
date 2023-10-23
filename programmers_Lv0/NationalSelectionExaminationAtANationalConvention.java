package programmers_Lv0;

import java.util.Map;
import java.util.TreeMap;

public class NationalSelectionExaminationAtANationalConvention {

	public static void main(String[] args) {
		int[] rank = {3, 7, 2, 5, 4, 6, 1};
		boolean[] attendance = {false, true, true, true, true, false, false};
		int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>();
		int count = 2;
        
		for(int i=0; i<rank.length; i++) {
			if(attendance[i]) {
				map.put(rank[i], i);
			}
		}
        
		for(int k : map.keySet()) {
            answer += map.get(k) * (int)Math.pow(100, count--);
            
            if(count<0) {
                break;
            }
        }
        
		System.out.println(answer);
	}
	
}
