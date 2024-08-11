package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalDevelopment {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int[] answer = {};
        int time = 0;
        int size = 0;
        List<Integer> distribution = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	if(progresses[i]+speeds[i]*time>=100) {
        		size = distribution.size() - 1;
        		distribution.set(size, distribution.get(size) + 1);
        	} else {
                while(progresses[i]+speeds[i]*time<100) {
                    time++;
                }
                
        		distribution.add(1);
        	}
        }
        
        answer = new int[distribution.size()];
        
        for(int i=0; i<distribution.size(); i++) {
        	answer[i] = distribution.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
