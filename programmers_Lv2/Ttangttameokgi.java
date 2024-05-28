package programmers_Lv2;

//import java.util.LinkedList;
//import java.util.Queue;

public class Ttangttameokgi {

	public static void main(String[] args) {
		int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
	    int answer = 0;
	    int max = 0;
	    
	    for(int i=1; i<land.length; i++) {
	    	for(int j=0; j<4; j++) {
	    		for(int z=0; z<4; z++) {
	    			if(j!=z) {
	    				max = Math.max(max, land[i-1][z]);
	    			}
	    		}
	    		
	    		land[i][j] += max;
	    		max = 0;
	    	}
	    }
	    
	    for(int i=0; i<4; i++) {
	    	answer = Math.max(answer, land[land.length-1][i]);
	    }
	    
	    System.out.println(answer);
	}

}
