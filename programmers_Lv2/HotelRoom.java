package programmers_Lv2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HotelRoom {

	public static void main(String[] args) {
		String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
		int answer = 0;
		int length = book_time.length;
		int[][] bookTime = new int[length][2];
		
		for(int i=0; i<length; i++) {
			String[] book = book_time[i];
			
			for(int j=0; j<2; j++) {
				String[] t = book[j].split(":");
				
				bookTime[i][j] = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
			}
		}

		Arrays.sort(bookTime, (a, b) -> a[0] - b[0]);
		
		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
		
		for(int[] bt : bookTime) {
			while(!q.isEmpty() && q.peek()+10<=bt[0]) {
				q.poll();
			}
			
			q.add(bt[1]);
			
			answer = Math.max(answer, q.size());
		}
		
		System.out.println(answer);
	}

}
