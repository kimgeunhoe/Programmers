package programmers_Lv2;

import java.util.ArrayList;
import java.util.List;

public class Cache {
//	https://school.programmers.co.kr/learn/courses/30/lessons/17680
	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		int answer = 0;
        int index = 0;
        List<String> list = new ArrayList<>();
		
		for(String c : cities) {
			c = c.toLowerCase();
			index = list.indexOf(c);
			
			if(index>=0) {
				answer -= 4;
				list.remove(index);
			}
			
			answer += 5;
			list.add(c);
			
			if(list.size()>cacheSize) {
				list.remove(0);
			}
		}
		
		System.out.println(answer);
	}

}
