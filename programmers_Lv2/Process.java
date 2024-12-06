package programmers_Lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Process {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42587
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		int answer = 0;
	    Queue<int[]> q = new LinkedList<>();
	    int index = priorities.length - 1;
	    int[] arr = {};
	    
	    for(int i=0; i<priorities.length; i++) {
	    	q.add(new int[] {i, priorities[i]});
	    }
	    
	    Arrays.sort(priorities);
	    
	    while(!q.isEmpty()) {
	    	arr = q.poll();
	    	
	    	if(arr[1]==priorities[index]) {
                answer++;
	    		index--;

	    		if(arr[0]==location) {
	    			break;
	    		}
	    	} else {
	    		q.add(arr);
	    	}
	    }
        
	    System.out.println(answer);
	}

}
