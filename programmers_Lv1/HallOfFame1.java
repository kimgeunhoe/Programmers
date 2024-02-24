package programmers_Lv1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class HallOfFame1 {

	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int[] answer = new int[score.length];
	    int index = 0;
	    Queue<Integer> hallOfFrame = new PriorityQueue<>();
	    
	    for(int s : score) {
	    	hallOfFrame.add(s);
	    	
	    	if(hallOfFrame.size()>k) {
	    		hallOfFrame.poll();
	    	}
	    	
	    	answer[index++] = hallOfFrame.peek();
	    }
        
	    System.out.println(Arrays.toString(answer));
	}

}
