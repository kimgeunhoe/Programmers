package programmers_Lv2;

public class TictactoByHimself {
//	https://school.programmers.co.kr/learn/courses/30/lessons/160585
	public static void main(String[] args) {
//		String[] board = {"O.X", ".O.", "..X"};
//		String[] board = {"OOO", "...", "XXX"};
//		String[] board = {"OOO", "O..", "XXX"};
		String[] board = {"OOO", "XOX", "XXO"};
		int answer = 0;
		int oCount = 0;
		int xCount = 0;
		boolean oWin = false;
		boolean xWin = false;
		
		for(String b : board) {
			for(char c : b.toCharArray()) {
				if(c=='O') {
					oCount++;
				} else if(c=='X') {
					xCount++;
				}
			}
		}
		
		if(xCount<=oCount && oCount-xCount<=1) {
			boolean bool = true;
			
			oWin = oCount>2 ? winCheck(board, 'O') : false;
			xWin = xCount>2 ? winCheck(board, 'X') : false;
			
			if((oWin && xWin) || (xWin && xCount!=oCount) || (oWin && xCount+1!=oCount)) {
				bool = false;
			}
			
			if(bool) {
				answer = 1;
			}
		}
		
		System.out.println(answer);
	}

	public static boolean winCheck(String[] board, char c) {
		boolean check = false;
		
		l : for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i].charAt(j)!=c) {
					continue l;
				}
			}
			
			check = true;
			
			break;
		}
		
		if(!check) {
			l : for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(board[j].charAt(i)!=c) {
						continue l;
					}
				}
				
				check = true;
				
				break;
			}
		}

		if(!check) {
			check = true;
			
			for(int i=0; i<3; i++) {
				if(board[i].charAt(i)!=c) {
					check = false;
					
					break;
				}
			}
		}

		if(!check) {
			check = true;
			
			for(int i=0; i<3; i++) {
				if(board[0+i].charAt(2-i)!=c) {
					check = false;
					
					break;
				}
			}
		}
		
		return check;
	}
}
