package programmers_Lv1;

import java.util.Arrays;

public class RemoveMin {

	public static void main(String[] args) {
		int[] arr = {10};
//		int[] arr = {4, 3, 2, 1};
		int[] answer = {};
	    int length = arr.length;
	    
	    if(length>1) {
	    	int min = arr[0];
	    	int index = 0;
	    	
	    	answer = new int[length-1];
	    	
	    	for(int i=1; i<length; i++) {
	    		min = Math.min(min, arr[i]);
	    	}
	    	
	    	for(int a : arr) {
	    		if(a!=min) {
	    			answer[index++] = a;
	    		}
	    	}
	    } else {
	    	answer = new int[] {-1};
	    }
	    
	    System.out.println(Arrays.toString(answer));
	}

}
