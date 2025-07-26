package programmers_Lv1;

public class AdjacentCompartment {

	public static void main(String[] args) {
		String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
		int h = 1;
		int w = 1;
		int answer = 0;
		int wLength = board[0].length;
		int hLength = board.length;
		int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		String color = board[h][w];
		
		for(int[] m : move) {
			int x = w + m[1];
			int y = h + m[0];
			
			if(x>=0 && x<wLength && y>=0 && y<hLength && color.equals(board[y][x])) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
