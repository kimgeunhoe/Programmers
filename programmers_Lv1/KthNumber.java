package programmers_Lv1;

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			if(commands[i][0]!=commands[i][1]) {
				int[] num = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
				Arrays.sort(num);
				answer[i] = num[commands[i][2]-1];
			} else {
				answer[i] = array[commands[i][0]-1];
			}
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
	}

}
