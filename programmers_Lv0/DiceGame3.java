package programmers_Lv0;

import java.util.HashMap;
import java.util.Map;

public class DiceGame3 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181916
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;
		int d = 2;
        int answer = 1;
        int[] nums = {a, b, c, d};
        Map<Integer, Integer> point = new HashMap<>();
        int p = 0;
        int q = 0;
        
        for(int n : nums) {
        	point.put(n, point.getOrDefault(n, 0) + 1);
        }

        switch (point.size()) {
			case 1:
				answer = 1111 * a;
				break;
			case 2:
				for(int k : point.keySet()) {
					if(point.get(k)==3 || (point.get(k)==2 && p==0)) {
						p = k;
					} else {
						q = k;
					}
				}
				
				answer = point.get(a)==2 ? (p + q) * Math.abs(p - q) : (int)Math.pow(p * 10 + q, 2);
				break;
			case 3:
				for(int k : point.keySet()) {
					if(point.get(k)!=2) {
						answer *= k;
					}
				}
				
				break;
			case 4:
				answer = 6;
                
				for(int k : point.keySet()) {
					answer = Math.min(answer, k);
				}
				
				break;
			default:
				break;
		}
        
        System.out.println(answer);
	}

}
