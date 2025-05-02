package programmers_Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class EscapeToTheLabyrinth {
//	https://school.programmers.co.kr/learn/courses/30/lessons/159993
	public static void main(String[] args) {
		String[] maps = {"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"};
		int answer = -1;
		int width = maps.length;
		int height = maps[0].length();
		char[][] labyrinth = new char[width][height];
		boolean[][] visit = new boolean[width][height];
		int[][] direct = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
		Queue<int[]> q = new LinkedList<>();
		boolean bool = true;
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
				char c = maps[i].charAt(j);
				
				if('S'==c) {
					visit[i][j] = true;
					
					q.add(new int[] {i, j, 0});
				}
				
				labyrinth[i][j] = c;
			}
		}
		
		while(!q.isEmpty() && bool) {
			int[] current = q.poll();
			
			for(int[] d : direct) {
				int x = current[0] + d[0];
				int y = current[1] + d[1];
				
				if(x>=0 && x<width && y>=0 && y<height && labyrinth[x][y]!='X' && !visit[x][y]) {
					if(labyrinth[x][y]=='L') {
						q.clear();
						q.add(new int[] {x, y, current[2] + 1});
						bool = false;
						
						break;
					}
					
					visit[x][y] = true;
					
					q.add(new int[] {x, y, current[2] + 1});
				}
			}
		}
		
		bool = true;
		visit = new boolean[width][height];
		
		while(!q.isEmpty() && bool) {
			int[] current = q.poll();
			
			for(int[] d : direct) {
				int x = current[0] + d[0];
				int y = current[1] + d[1];
				
				if(x>=0 && x<width && y>=0 && y<height && labyrinth[x][y]!='X' && !visit[x][y]) {
					if(labyrinth[x][y]=='E') {
						answer = current[2] + 1;
						bool = false;
						
						break;
					}
					
					visit[x][y] = true;
					
					q.add(new int[] {x, y, current[2] + 1});
				}
			}
		}
		
		System.out.println(answer);
	}

}