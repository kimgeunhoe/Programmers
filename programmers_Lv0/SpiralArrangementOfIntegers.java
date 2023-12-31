package programmers_Lv0;

import java.util.Arrays;

public class SpiralArrangementOfIntegers {

	public static void main(String[] args) {
		int n = 4;
		int[][] answer = new int[n][n];
	    int max = n * 2;
	    int[][] move = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	    int x = 0;
	    int y = -1;
	    int[] point = {};
	    int num = 1;
	    
	    for(int i=0; i<max; i++) {
	    	point = move[i%4];
	    	
	    	for(int j=0; j<(max-i)/2; j++) {
	    		x += point[0];
	    		y += point[1];
	    		answer[x][y] = num++;
	    	}
	    }
		
		System.out.println(Arrays.deepToString(answer));
	}

}
