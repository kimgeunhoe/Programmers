package programmers_Lv0;

public class SafeZone {

	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
		int length = board.length;
	    int answer = length * length;
	    int x=0, y=0;
	    
	    for(int i=0; i<length; i++) {
	    	for(int j=0; j<length; j++) {
	    		if(board[i][j]==1) {
	    			answer--;
	    			
	    			for(int a=-1; a<=1; a++) {
	    				x = i + a;
	    				
	    				if(x>=0 && x<length) {
	    					for(int b=-1; b<=1; b++) {
	    						y = j + b;
	    						
	    						if(y>=0 && y<length && board[x][y]==0) {
	    							board[x][y] = 2;
	    							answer--;
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
