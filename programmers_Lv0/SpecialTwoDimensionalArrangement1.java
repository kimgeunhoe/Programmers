package programmers_Lv0;

import java.util.Arrays;

public class SpecialTwoDimensionalArrangement1 {

	public static void main(String[] args) {
		int n = 3;
		int[][] answer = new int[n][n];
		        
		for(int i=0; i<n; i++) {
			answer[i][i] = 1;
		}
		        
		System.out.println(Arrays.deepToString(answer));
	}

}
