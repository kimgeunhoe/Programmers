package programmers_Lv0;

public class MakeTwoDimensions {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
	    int[][] answer = new int[num_list.length/n][n];
	    
	    for(int i=0; i<num_list.length; i++) {
	    	answer[i/n][i%n] = num_list[i];
	    	System.out.println(answer[i/n][i%n]);
	    }
	}

}
