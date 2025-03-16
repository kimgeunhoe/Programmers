package programmers_Lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VisitLength {
//	https://school.programmers.co.kr/learn/courses/30/lessons/49994
	public static void main(String[] args) {
//		String dirs = "LULLLLLLU";
		String dirs = "ULURRDLLU";
		int answer = 0;
		int[] position = {0, 0};
		Set<String> set = new HashSet<>();
		Map<Character, int[]> map = new HashMap<>();
		
		map.put('R', new int[] {1, 0});
		map.put('L', new int[] {-1, 0});
		map.put('U', new int[] {0, 1});
		map.put('D', new int[] {0, -1});
		
//		Map<Character, int[]> map = Map.of(
//	            'R', new int[] {1, 0},
//	            'L', new int[] {-1, 0},
//			    'U', new int[] {0, 1},
//			    'D', new int[] {0, -1}
//	        );
		
		for(int i=0; i<dirs.length(); i++) {
			String positionStr = makeStr(position, ',');
			int[] move = map.get(dirs.charAt(i));
			int[] nextPosition = {position[0] + move[0], position[1] + move[1]};

			if(checkRange(nextPosition)) {
				position = nextPosition.clone();
				
				String nextPositionStr = makeStr(position, ',');
				
				if(set.add(makeStr(positionStr, nextPositionStr, ' '))) {
					answer++;
					set.add(makeStr(nextPositionStr, positionStr, ' '));
				}
			}
		}

		System.out.println(answer);
	}

	public static String makeStr(int[] arr, char seperator) {
		return new StringBuilder().append(arr[0]).append(seperator).append(arr[1]).toString();
	}

	public static String makeStr(String str1, String str2, char seperator) {
		return new StringBuilder(str1).append(seperator).append(str2).toString();
	}
	
	public static boolean checkRange(int[] arr) {
		boolean bool = true;
		
		for(int a : arr) {
			bool &= a>=-5 && a<=5;
		}
		
		return bool;
	}
}
