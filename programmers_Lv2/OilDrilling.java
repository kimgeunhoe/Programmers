package programmers_Lv2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OilDrilling {
//	https://school.programmers.co.kr/learn/courses/30/lessons/250136
	public static void main(String[] args) {
		int[][] land = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
		int landLength = land[0].length;
		int landDepth = land.length;
		int[] oilCount = new int[landLength];
		boolean[][] visit = new boolean[landDepth][landLength];
		int[][] direct = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
		
		for(int i=0; i<landLength; i++) {
			for(int j=0; j<landDepth; j++) {
				if(land[j][i]==1 && !visit[j][i]) {
					Queue<int[]> q = new LinkedList<>();
					Set<Integer> push = new HashSet<>();
					int count = 1;
					
					q.add(new int[] {j, i});
					
					visit[j][i] = true;
					
					push.add(i);
					
					while(!q.isEmpty()) {
						int[] point = q.poll();
						
						for(int k=0; k<direct.length; k++) {
							int[] d = direct[k];
							int x = point[0] + d[0];
							int y = point[1] + d[1];

							if(x>=0 && x<landDepth && y>=0 && y<landLength && land[x][y]==1 && !visit[x][y]) {
								q.add(new int[] {x, y});
								
								visit[x][y] = true;
								
								push.add(y);
								
								count++;
							}
						}
					}

					for(int p : push) {
						oilCount[p] += count;
					}
				}
			}
		}

		System.out.println(Arrays.stream(oilCount).max().getAsInt());
	}

}
