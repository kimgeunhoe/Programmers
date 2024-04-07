package programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrialExam {

	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5};
	    int[] answer = {};
	    int[] a = {1, 2, 3, 4, 5};
	    int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
	    int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	    List<Integer> list = new ArrayList<>();
	    int[] count = new int[3];
	    int max = 0;
	    
	    for(int i=0; i<answers.length; i++) {
	    	if(answers[i]==a[i%a.length]) {
	    		count[0]++;
	    	}
	    	
	    	if(answers[i]==b[i%b.length]) {
	    		count[1]++;
	    	}
	    	
	    	if(answers[i]==c[i%c.length]) {
	    		count[2]++;
	    	}
	    }
	    
	    max = Math.max(count[0], Math.max(count[1], count[2]));
	    
	    for(int i=0; i<count.length; i++) {
	    	if(count[i]==max) {
	    		list.add(i+1);
	    	}
	    }
	    
	    answer = new int[list.size()];
	    
	    for(int i=0; i<answer.length; i++) {
	    	answer[i] = list.get(i);
	    }
	    
	    System.out.println(Arrays.toString(answer));
	}

}
