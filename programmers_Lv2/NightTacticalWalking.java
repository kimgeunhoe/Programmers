package programmers_Lv2;

public class NightTacticalWalking {

	public static void main(String[] args) {
		int distance = 12;
		int[][] scope = {{7, 8}, {4, 6}, {11, 10}};
		int[][] times = {{2, 2}, {2, 4}, {3, 3}};
//		int distance = 10;
//		int[][] scope = {{3, 4}, {5, 8}};
//		int[][] times = {{2, 5}, {4, 3}};
	    int answer = distance;
	    int max = 0;
	    int min = 0;;

	    for(int i=0; i<scope.length; i++) {
	    	max = Math.max(scope[i][0], scope[i][1]);
	    	min = Math.min(scope[i][0], scope[i][1]);
	    	
	    	for(int j=min; j<=max; j++) {
	    		if(j%(times[i][0]+times[i][1])<=times[i][0] && j%(times[i][0]+times[i][1])!=0) {
	    			if(answer>j) {
	    				answer = j;
	    			}
	    			
	    			break;
	    		}
	    	}
	    }

	    System.out.println(answer);
	}

}
