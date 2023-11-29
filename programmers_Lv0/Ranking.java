package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranking {

	public static void main(String[] args) {
//		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		int[] answer = new int[score.length];
	    List<Integer> list = new ArrayList<>();
	    
	    for(int[] s : score) {
	    	list.add(s[0] + s[1]);
	    }
	    
	    Collections.sort(list, Comparator.reverseOrder());
	    
	    for(int i=0; i<answer.length; i++) {
	    	answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
	    }
		
	    System.out.println(Arrays.toString(answer));
	}

}
