package programmers_Lv1;

import java.util.ArrayList;
import java.util.List;

public class CraneDoll {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		List<Integer> basket = new ArrayList<>();
		int s = 0;
		int answer = 0;
		
//		for(int m : moves) {
//			for(int i=0; i<board.length; i++) {
//				if(board[i][m-1]!=0) {
//					basket.add(board[i][m-1]);
//					board[i][m-1] = 0;
//					
//					s = basket.size();
//					
//					if(s>1) {
//						if(basket.get(s-2)==basket.get(s-1)) {
//							basket.remove(s-1);
//							basket.remove(s-2);
//							answer += 2;
//						}
//					}
//					break;
//				}
//			}
//		}

		for(int m : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][m-1]!=0) {
					s = basket.size();
					
					if(s>0) {
						if(board[i][m-1]==basket.get(s-1)) {
							basket.remove(s-1);
							answer += 2;
						} else {
							basket.add(board[i][m-1]);
						}
					} else {
						basket.add(board[i][m-1]);
					}
					
					board[i][m-1] = 0;
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
