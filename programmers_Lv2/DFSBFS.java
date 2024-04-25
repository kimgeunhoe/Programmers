package programmers_Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class DFSBFS {

	public static void main(String[] args) {
		int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
	    int answer = -1;
	    int[][] move = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	    int x = maps.length;
	    int y = maps[0].length;
	    int a = 0;
	    int b = 0;
	    Queue<int[]> q = new LinkedList<>();

	    q.add(new int[] {0, 0, 1});
	    
	    while(!q.isEmpty()) {
	    	int[] ind = q.poll();
	    	
	    	if(ind[0]==x-1 && ind[1]==y-1) {
	    		answer = ind[2];
	    		break;
	    	}
	    	
	    	for(int i=0; i<4; i++) {
	    		a = ind[0] + move[i][0];
	    		b = ind[1] + move[i][1];
	    		
	    		if(a>=0 && a<x && b>=0 && b<y && maps[a][b]==1) {
	    			maps[a][b] = 0;
					q.add(new int[] {a, b, ind[2] +1});
				}
	    	}
	    }
	    
	    System.out.println(answer);
	}

}