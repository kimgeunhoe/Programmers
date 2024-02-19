package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FailureLate {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = new int[N];
        float[] stage = new float[N];
        Map<Integer, Float> map = new HashMap<>();
        int gamer = stages.length;
        int index = 0;
        
        for(int s : stages) {
        	if(s<=N) {
        		map.put(s, map.getOrDefault(s, 0.0f) + 1);
        	}
        }
     
        for(int i=0; i<N; i++) {
        	if(map.containsKey(i+1)) {
        		stage[i] = gamer>0 ? map.get(i+1) / gamer : 0.0f;
        		gamer -= map.get(i+1);
        		map.put(i+1, stage[i]);
        	} else {
        		map.put(i+1, 0.0f);
        	}
        }
        
        Arrays.sort(stage);
        
        for(int i=N-1; i>=0; i--) {
        	for(int k : map.keySet()) {
        		if(map.get(k)==stage[i]) {
        			answer[index++] = k;
        			map.remove(k);
        			break;
        		}
        	}
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
