package programmers_Lv2;

public class NLeastCommonMultiple {

	public static void main(String[] args) {
//		int[] arr = {1, 2, 3};
		int[] arr = {2, 6, 8, 14};
	    int answer = arr[0];
	    int min = 0;
	    int max = 0;
	    
	    for(int i=1; i<arr.length; i++) {
	    	min = Math.min(answer, arr[i]);
	    	max = Math.max(answer, arr[i]);
	    	int j = 0;
	    	
	    	for(j=min; j>=2; j--) {
	    		if(min%j==0 && max%j==0) {
	    			break;
	    		}
	    	}
	    	
	    	answer = min * max / j;
	    }
	    
	    System.out.println(answer);
	}
}
