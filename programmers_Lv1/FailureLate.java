package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FailureLate {

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4, 4 ,4 ,4, 4};
//		int N = 5;
//		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer = new int[N];
		float[] failureLate = new float[N];
		Map<Integer, Float> map = new HashMap<>();
		int nonClearPlayer, stagePlayer;
		float fl;
		
		for(int i=1; i<=N; i++) {
			nonClearPlayer = 0;
			stagePlayer = 0;
			
			for(int s : stages) {
				if(s>=i) {
					stagePlayer++;
					if(s==i) {
						nonClearPlayer++;
					}
				}
			}
			
			fl = stagePlayer!=0 ? (float)nonClearPlayer/stagePlayer : 0.0f;
			failureLate[i-1] = fl;
			map.put(i, fl);
		}
		
		Arrays.sort(failureLate);
		
		for(int i=N-1; i>=0; i--) {
			for(int j=1; j<=N; j++) {
				if(map.get(j)==failureLate[i]) {
					answer[N-i-1] = j;
					map.put(j, -1f);
					break;
				}
			}
		}

		for(int a : answer) {
			System.out.println(a);
		}
	}

}
