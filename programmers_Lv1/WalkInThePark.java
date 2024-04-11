package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WalkInThePark {

	public static void main(String[] args) {
		String[] park = {"SOO","OOO","OOO"};
		String[] routes = {"E 2","S 2","W 1"};
		int[] answer = {};
		String[] direct = {};
		int[] move = {};
		int index = 0;
		int x = 0;
		int y = 0;
		Map<String, int[]> map = new HashMap<>();
		
		map.put("E", new int[] {0, 1});
		map.put("W", new int[] {0, -1});
		map.put("S", new int[] {1, 0});
		map.put("N", new int[] {-1, 0});
		
		//java 9부터
//		Map<String, int[]> map = Map.of(
//				"E", new int[] {0, 1},
//				"W", new int[] {0, -1},
//				"S", new int[] {1, 0},
//				"N", new int[] {-1, 0}
//		);
		
		for(int i=0; i<park.length; i++) {
			index = park[i].indexOf("S");
			
			if(index>-1) {
				answer = new int[] {i, index};
				break;
			}
		}
		
		l : for(String r : routes) {
			direct = r.split(" ");
			move = map.get(direct[0]);
			y = answer[0];
			x = answer[1];
			
			for(int i=0; i<Integer.parseInt(direct[1]); i++) {
				y += move[0];
				x += move[1];
				
				if(y<0 || y>=park.length || x<0 || x>=park[0].length() || park[y].charAt(x)=='X') {
					continue l;
				}
			}
			
			answer[0] = y;
			answer[1] = x;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
