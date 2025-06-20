package programmers_Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class RicochetRobot {
//	https://school.programmers.co.kr/learn/courses/30/lessons/169199
	public static void main(String[] args) {
		String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
		int answer = -1;
		int height = board.length;
		int width = board[0].length();
		boolean[][] visit = new boolean[height][width];
		int[] start = new int[2];
		int[] hMove = {-1, 1, 0, 0};
		int[] wMove = {0, 0, -1, 1};
		Queue<int[]> q = new LinkedList<>();
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				if(board[i].charAt(j)=='R') {
					start[0] = i;
					start[1] = j;
					
					q.add(new int[] {i, j, 0});
					
					visit[i][j] = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			
			for(int i=0; i<4; i++) {
				int x = pos[0];
				int y = pos[1];
				int count = pos[2];
				
				do {
					x += hMove[i];
					y += wMove[i];
				} while(x>=0 && x<height && y>=0 && y<width && board[x].charAt(y)!='D');
				
				x -= hMove[i];
				y -= wMove[i];
				
				if(x!=pos[0] || y!=pos[1]) {
					count++;
					
					if(board[x].charAt(y)=='G') {
						answer = count;
						
						q.clear();
						
						break;
					}
					
					if(!visit[x][y]) {
						q.add(new int[] {x, y, count});
						
						visit[x][y] = true;
					}
				}
			}
		}
		
		System.out.println(answer);
	}

}
