package programmers_Lv1;

import java.util.Arrays;

public class FruitSeller {

	public static void main(String[] args) {
//		int k =3;
//		int m = 4;
//		int[] score = {1, 2, 3, 1, 2, 3, 1};
		int k =4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
	    int answer = 0;

	    Arrays.sort(score);
	    
	    for(int i=score.length-m; i>=0; i-=m) {
	    	answer += score[i] * m;
	    }
	    
	    System.out.println(answer);
	}

}
