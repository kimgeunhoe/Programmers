package programmers_Lv2;

import java.util.PriorityQueue;
import java.util.Queue;

public class MoreSpicy {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42626
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
		
		for(int s : scoville) {
			queue.add(s);
		}
		
		while(queue.peek()<K) {
			if(queue.size()<2) {
				answer = -1;
				break;
			}
			
			queue.add(queue.poll() + queue.poll() * 2);
			answer++;
		}
		
	    System.out.println(answer);
	}

}
