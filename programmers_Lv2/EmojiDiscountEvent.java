package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EmojiDiscountEvent {
//	https://school.programmers.co.kr/learn/courses/30/lessons/150368
	public static void main(String[] args) {
		int[][] users = {{40, 10000}, {25, 10000}};
		int[] emoticons = {7000, 9000};
		int[] answer = {0, 0};
		int[] discountRate = {10, 20, 30, 40};
		Queue<List<Integer>> q = new LinkedList<>();
		
		for(int d : discountRate) {
			List<Integer> l = new ArrayList<>();
			
			l.add(d);
			q.add(l);
		}
		
		for(int i=0; i<emoticons.length-1; i++) {
			int size = q.size();
			
			for(int j=0; j<size; j++) {
				List<Integer> list = q.poll();

				for(int d : discountRate) {
					List<Integer> l = new ArrayList<>(list);
					
					l.add(d);
					q.add(l);
				}
			}
		}
		
		while(!q.isEmpty()) {
			List<Integer> dr = q.poll();
			int emoticonPlus = 0;
			int sumPrice = 0;
			
			for(int i=0; i<users.length; i++) {
				int[] user = users[i];
				int price = 0;
				
				for(int j=0; j<dr.size(); j++) {
					if(dr.get(j)>=user[0]) {
						price += emoticons[j] * (100 - dr.get(j)) / 100;
					}
				}
				
				if(price>= user[1]) {
					emoticonPlus++;
				} else {
					sumPrice += price;
				}
			}
			System.out.println(emoticonPlus + " " + sumPrice);
			if(answer[0]<emoticonPlus) {
				answer[0] = emoticonPlus;
				answer[1] = sumPrice;
			} else if(answer[0]==emoticonPlus && answer[1]<sumPrice) {
				answer[1] = sumPrice;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
