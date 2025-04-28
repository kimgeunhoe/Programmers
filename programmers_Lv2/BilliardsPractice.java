package programmers_Lv2;

import java.util.Arrays;

public class BilliardsPractice {
//	https://school.programmers.co.kr/learn/courses/30/lessons/169198
	public static void main(String[] args) {
		int m = 10;
		int n = 10;
		int startX = 3;
		int startY = 7;
		int[][] balls = {{7, 7}, {2, 7}, {7, 3}};
		int[] answer = new int[balls.length];

		for(int i=0; i<balls.length; i++) {
			int targetX = balls[i][0];
			int targetY = balls[i][1];
			int curlen, len = Integer.MAX_VALUE;

			if (!(startY==targetY && startX>=targetX)) {
				curlen = getDistance(startX, startY, targetX * (-1), targetY);
				len = curlen<len ? curlen : len;
			}

			if (!(startY==targetY && startX<=targetX)) {
				curlen = getDistance(startX, startY, m + (m - targetX), targetY);
				len = curlen<len ? curlen : len;
			}

			if (!(startX==targetX && startY<=targetY)) {
				curlen = getDistance(startX, startY, targetX, n + (n - targetY));
				len = curlen<len ? curlen : len;
			}

			if (!(startX==targetX && startY>=targetY)) {
				curlen = getDistance(startX, startY, targetX, targetY * (-1));
				len = curlen<len ? curlen : len;
			}
			
			answer[i] = len;
		}
		
		System.out.println(Arrays.toString(answer));
	}

	public static int getDistance(int sx, int sy, int tx, int ty) {
		return (int) (Math.pow(sx - tx, 2) + Math.pow(sy - ty, 2));
	}
}
