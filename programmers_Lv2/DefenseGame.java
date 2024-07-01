package programmers_Lv2;

import java.util.PriorityQueue;
import java.util.Queue;

public class DefenseGame {
//	https://school.programmers.co.kr/learn/courses/30/lessons/142085
	public static void main(String[] args) {
//		int n = 7;
//		int k = 3;
//		int[] enemy = {4, 2, 4, 5, 3, 3, 1};
//		int n = 2;
//		int k = 4;
//		int[] enemy = {3, 3, 3, 3};
		int n = 7;
		int k = 3;
		int[] enemy = {4, 2, 4, 5, 3, 2, 1};
		int answer = 0;
		Queue<Integer> q = new PriorityQueue<>();
		
		for(; answer<enemy.length; answer++) {
			q.add(enemy[answer]);
			
			if(q.size()>k) {
				n -= q.poll();

				if(n<=0) {
					if(n==0) {
						answer++;
					}
					
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
