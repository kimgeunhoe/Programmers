package programmers_Lv2;

import java.util.Arrays;

public class PerfectCrime {
//	https://school.programmers.co.kr/learn/courses/30/lessons/389480
	public static void main(String[] args) {
//		int[][] info = {{1, 2}, {2, 3}, {2, 1}};
//		int n = 4;
//		int m = 4;
		int[][] info = {{1, 2}, {2, 3}, {2, 1}};
		int n = 1;
		int m = 7;
//		int[][] info = {{3, 3}, {3, 3}};
//		int n = 7;
//		int m = 1;
		int answer = 121;
		int size = info.length;
        int[][] dp = new int[size+1][m];
        
        for(int i=0; i<=size; i++) {
        	Arrays.fill(dp[i], answer);
        }
        
        dp[0][0] = 0;
        
        for(int i=1; i<=size; i++) {
            int a = info[i-1][0];
            int b = info[i-1][1];

            for(int j=0; j<m; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + a);

                if(j+b<m) {
                    dp[i][j+b] = Math.min(dp[i][j+b], dp[i-1][j]);
                }
            }    
        }

        int[] result = dp[size];
        
        Arrays.sort(result);
        
        answer = result[0];
        
		System.out.println(answer>=n ? -1 : answer);
	}

}
