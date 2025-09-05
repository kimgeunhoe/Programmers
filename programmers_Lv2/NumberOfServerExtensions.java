package programmers_Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfServerExtensions {
//	https://school.programmers.co.kr/learn/courses/30/lessons/389479
	public static void main(String[] args) {
		int[] players = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
		int m = 3;
		int k = 5;
		int answer = 0;
		int currentServerCount = 0;
		Queue<int[]> serverExpiredTime = new LinkedList<>();
		
		for(int i=0; i<players.length; i++) {
			int playerCount = players[i];
			int requiredServerCount = playerCount/m;
			int addServerCount = 0;

			if(!serverExpiredTime.isEmpty() && serverExpiredTime.peek()[0]==i) {
				currentServerCount -= serverExpiredTime.poll()[1];
			}
			
			addServerCount = requiredServerCount - currentServerCount;

			if(addServerCount>0) {
				answer += addServerCount;
				currentServerCount = requiredServerCount;

				serverExpiredTime.add(new int[] {i + k, addServerCount});
			}
		}
		
		System.out.println(answer);
	}

}
