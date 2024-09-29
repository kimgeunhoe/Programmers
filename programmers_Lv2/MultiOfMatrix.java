package programmers_Lv2;

public class MultiOfMatrix {

	public static void main(String[] args) {
//		int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
//		int[][] arr2 = {{3, 3}, {3, 3}};
		int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
		int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		int column = arr1.length;
		int row = arr2[0].length;
	    int[][] answer = new int[column][row];
	    
	    for(int i=0; i<column; i++) {
	    	for(int j=0; j<row; j++) {
	    		for(int k=0; k<arr1[0].length; k++) {
	    			answer[i][j] += arr1[i][k] * arr2[k][j];
	    		}
	    		
	    		System.out.print(answer[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	}

}
