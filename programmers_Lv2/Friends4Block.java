package programmers_Lv2;

import java.util.ArrayList;
import java.util.List;

public class Friends4Block {
//	https://school.programmers.co.kr/learn/courses/30/lessons/17679
	public static void main(String[] args) {
		int m = 6;
		int n = 6;
		String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
//		int m = 4;
//		int n = 5;
//		String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		int answer = 0;
        StringBuilder[] sb = new StringBuilder[n];
		List<char[]> list = new ArrayList<>();
		int[][] move = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
		int x = 0;
		int y = 0;
		boolean bool = true;
		
		for(int i=0; i<n; i++) {
			sb[i] = new StringBuilder();
			
			for(int j=m-1; j>=0; j--) {
				sb[i].append(board[j].charAt(i));
			}
			
			list.add(sb[i].toString().toCharArray());
		}
		
		while(bool) {
			bool = false;
			
			for(int i=0; i<sb.length-1; i++) {
				l : for(int j=0; j<sb[i].length()-1; j++) {
					if(sb[i+1].length()<=j+1) {
						break;
					} 

					for(int k=1; k<4; k++) {
						x = i + move[k][0];
						y = j + move[k][1];
						
						if(sb[i].charAt(j)!=sb[x].charAt(y)) {
							continue l;
						}
					}

					bool = true;
					
					for(int[] mv : move) {
						x = i + mv[0];
						y = j + mv[1];
						
						if(list.get(x)[y]!=' ') {
							list.get(x)[y] = ' ';
							answer++;
						}
					}
				}
			}

			if(bool) {
				for(int i=0; i<list.size(); i++) {
					sb[i].setLength(0);
					
					for(int j=0; j<list.get(i).length; j++) {
						if(list.get(i)[j]!=' ') {
							sb[i].append(list.get(i)[j]);
						}
					}
					
					list.set(i, sb[i].toString().toCharArray());
				}
			}
		}

	    System.out.println(answer);
	}

}
