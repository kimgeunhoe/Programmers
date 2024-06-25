package programmers_Lv2;

import java.util.Arrays;

public class CountingAfterQuadCompression {
//	https://school.programmers.co.kr/learn/courses/30/lessons/68936
	public static void main(String[] args) {
		int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
		int[] answer = {0, 0};
				
		quadCompression(answer, 0, 0, arr, arr.length);

		System.out.println(Arrays.toString(answer));
	}

	private static void quadCompression(int[] answer, int x, int y, int[][] arr, int length) {
		int num = arr[x][y];
		
		if(checkSame(arr, length, x, y, num)) {
			answer[num]++;
			
			return;
		}
		
		length /= 2;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				quadCompression(answer, x + length * i, y + length * j, arr, length);
			}
		}
	}
	
	private static boolean checkSame(int[][] arr, int length, int x, int y, int num) {
		for(int i=x; i<x+length; i++) {
			for(int j=y; j<y+length; j++) {
				if(arr[i][j]!=num) {
					return false;
				}
			}
		}
		
		return true;
	}
}
