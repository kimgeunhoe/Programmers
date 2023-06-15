package programmers_Lv1;

public class TheGreatestCommonDenominatorAndTheLeastCommonMultiple {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
	    int[] answer = new int[2];
	    int min = n>m ? m : n;
	    
	    for(int i=min; i>0; i--) {
	    	if(n%i==0 && m%i==0) {
	    		answer[0] = i;
	    		break;
	    	}
	    }
	    
	    answer[1] = n * m / answer[0];
	    
	    for(int a : answer) {
	    	System.out.println(a);
	    }
	}

}
