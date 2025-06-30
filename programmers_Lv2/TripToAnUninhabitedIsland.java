package programmers_Lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TripToAnUninhabitedIsland {
//	https://school.programmers.co.kr/learn/courses/30/lessons/154540
	public static void main(String[] args) {
		String[] maps = {"X591X", "X1X5X", "X231X", "1XXX1"};
		int[] answer = {};
		int col = maps.length;
		int row = maps[0].length();
		int[][] map = new int[col][row];
		boolean[][] visit = new boolean[col][row];
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		Queue<int[]> next = new LinkedList<>();
		Queue<Integer> sumQ = new PriorityQueue<>();
		int sum = 0;
		int index = 0;
		
		for(int i=0; i<col; i++) {
			String[] spot = maps[i].split("");
			
			for(int j=0; j<row; j++) {
				if(!"X".equals(spot[j])) {
					map[i][j] = Integer.parseInt(spot[j]);
				}
			}
		}

		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				if(!visit[i][j] && map[i][j]!=0) {
					visit[i][j] = true;
					
					next.add(new int[] {i, j});
					
					while(!next.isEmpty()) {
						int[] point = next.poll();
						int x = point[0];
						int y = point[1];
						
						sum += map[x][y];
						
						for(int k=0; k<dx.length; k++) {
							int nextX = x+dx[k];
							int nextY = y+dy[k];
							
							if(nextX>=0 && nextX<col && nextY>=0 && nextY<row) {
								if(!visit[nextX][nextY] && map[nextX][nextY]!=0) {
									visit[nextX][nextY] = true;
									next.add(new int[] {nextX, nextY});
								}
							}
						}
					}

					sumQ.add(sum);
					
					sum = 0;
				}
			}
		}

		if(sumQ.size()==0) {
			answer = new int[] {-1};
		} else {
			answer = new int[sumQ.size()];
			
			while(!sumQ.isEmpty()) {
				answer[index++] = sumQ.poll();
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
