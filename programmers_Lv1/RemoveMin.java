package programmers_Lv1;

public class RemoveMin {

	public static void main(String[] args) {
		int[] arr = {10};
//		int[] arr = {4, 3, 2, 1};
	    int[] answer = new int[arr.length!=1 ? arr.length-1 : 1];
	    int min = 999999;
	    int index = 0;
	    
	    if(arr.length!=1) {
	    	for(int a : arr) {
	    		min = min>a ? a : min;
	    	}
	    	
	    	for(int a : arr) {
	    		if(a!=min) {
	    			answer[index++] = a;
	    		}
	    	}
	    } else {
	    	answer[0] = -1;
	    }
	    
	    for(int a : answer) {
	    	System.out.println(a);
	    }
	}

}
