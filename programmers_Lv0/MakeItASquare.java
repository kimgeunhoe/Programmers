package programmers_Lv0;

import java.util.Arrays;

public class MakeItASquare {

	public static void main(String[] args) {
		int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
		int length = Math.max(arr.length, arr[0].length);
	    int[][] answer = new int[length][length];

	    for(int i=0; i<arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }
	    
	    System.out.print(Arrays.deepToString(answer));
	}

}
