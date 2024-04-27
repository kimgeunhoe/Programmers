package programmers_Lv2;

public class FindTheLargestSquare {

	public static void main(String[] args) {
//		int [][]board = {{0, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
//		int [][]board = {{0, 0, 1, 1}, {1, 1, 1, 1}};
		int [][]board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        int answer = 0;
//        int row = board.length;
//        int columm = board[0].length;
//        boolean check = true;
//        int count = 0;
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
        
        for(int i=0; i<board.length; i++) {
        	for(int j=0; j<board[0].length; j++) {
        		if(board[i][j]==1) {
        			if(answer==0 && (i==0 || j==0)) {
        				answer = 1;
        			} else if(i!=0 && j!=0) {
        				board[i][j] = Math.min(board[i-1][j], Math.min(board[i][j-1], board[i-1][j-1])) + 1;
            			answer = Math.max(answer, board[i][j]);
        			}
        		}
        	}
        }
        
        
//        for(int i=0; i<row; i++) {
//        	if(answer>row-i) {
//        		break;
//        	}
//        	
//        	for(int j=0; j<columm; j++) {
//        		if(answer>columm-j) {
//        			break;
//        		}
//        		
//        		if(board[i][j]==1) {
//        			count = 1;
//        			
//        			while(true) {
//        				a = i+count;
//        				b = j+count;
//        				
//        				if(a<row && b<columm) {
//        					for(int x=0; x<count; x++) {
//        						c = i + x;
//        						d = j + x;
//        						
//        						if(c>=row || d>=columm || board[a][d]!=1 || board[c][b]!=1) {
//        							check = false;
//        							break;
//        						}
//        					}
//
//        					if(check==false || board[a][b]!=1) {
//        						break;
//        					} else{
//        						count++;
//        					}
//        				} else {
//        					break;
//        				}
//        			}
//        		}
//        		
//        		answer = count > answer ? count : answer;
//        		check = true;
//        	}
//        }
        
        System.out.println(answer * answer);
	}
}
