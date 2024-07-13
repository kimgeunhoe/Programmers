package programmers_Lv2;

import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {
//	https://school.programmers.co.kr/learn/courses/30/lessons/131127
	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		int answer = discount.length - 9;
		Map<String, Integer> wantMap = new HashMap<>();
		int length = want.length;
		int[] count = new int[length];
		String key = "";
		
		for(int i=0; i<length; i++) {
			wantMap.put(want[i], i);
		}
		
		for(int i=0; i<=discount.length-10; i++) {
			for(int j=i; j<i+10; j++) {
				key = discount[j];
				
				if(wantMap.containsKey(key)) {
					count[wantMap.get(key)]++;
				}
			}

			for(int j=0; j<length; j++) {
				if(number[j]!=count[j]) {
					answer--;
					break;
				}
			}

			count = new int[length];
		}
		
		System.out.println(answer);
	}

}
