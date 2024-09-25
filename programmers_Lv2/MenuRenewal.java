package programmers_Lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MenuRenewal {
//	https://school.programmers.co.kr/learn/courses/30/lessons/72411
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2, 3, 4};
		String[] answer = {};
		Map<String, Integer> map = new HashMap<>();
		
		for(String order : orders) {
			Queue<String> q = new LinkedList<>();
			int orderLength = order.length();
			
			for(int i=0; i<orderLength; i++) {
				q.add("");
			}
			
			for(int c : course) {
				while(q.peek().length()!=c) {
					String str = q.poll();
					
					for(int i=0; i<orderLength; i++) {
						if(str.indexOf(Character.toString(order.charAt(i)))<0) {
							
						}
					}
					
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
