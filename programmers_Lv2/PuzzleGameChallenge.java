package programmers_Lv2;

import java.util.Arrays;

public class PuzzleGameChallenge {

	public static void main(String[] args) {
		int[] diffs = {1, 5, 3};
		int[] times = {2, 4, 7};
		long limit = 30;
		int maxLevel = Arrays.stream(diffs).max().getAsInt();
		int minLevel = 1;
		
		while(minLevel<maxLevel) {
			long count = 0;
			int avgLevel = (maxLevel + minLevel) / 2;
			
			for(int j=0; j<diffs.length; j++) {
				count += avgLevel>=diffs[j] ? times[j] : (diffs[j] - avgLevel) * (times[j-1] + times[j]) + times[j];
			}
			
			if(limit>=count) {
				maxLevel = avgLevel;
			} else {
				minLevel = avgLevel + 1;
			}
		}
		
		System.out.println(maxLevel);
	}

}
