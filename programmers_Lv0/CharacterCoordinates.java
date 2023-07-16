package programmers_Lv0;

import java.util.Arrays;

public class CharacterCoordinates {

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
//		String[] keyinput = {"left", "left", "left", "left", "right", "right", "right", "right"};
//		int[] board = {5, 5};
		int[] answer = {0, 0};
        int index = 0;
        int pm = 0;
        board[0] /= 2;
        board[1] /= 2;
        
        for(String k : keyinput) {
        	index = k.equals("left") || k.equals("right") ? 0 : 1;
        	pm = k.length()!=4 ? 1 : -1;
            
            if(answer[index]!=board[index]*pm) {
                answer[index] += pm;
            }
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
