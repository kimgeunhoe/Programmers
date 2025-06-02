package programmers_Lv2;

import java.util.Arrays;

public class InterceptSystem {

	public static void main(String[] args) {
		int[][] targets = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};
		int answer = 0;
		int before = 0;

		Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        
        for(int i=0; i<targets.length; i++){
            if(before<=targets[i][0]) {
                before = targets[i][1];
                
                answer++;
            }
        }
        
        System.out.println(answer);
	}

}
