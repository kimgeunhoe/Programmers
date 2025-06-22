package programmers_Lv2;

import java.util.Arrays;

public class SumOfSuccessivePartialSequences {
//	https://school.programmers.co.kr/learn/courses/30/lessons/178870
	public static void main(String[] args) {
		int[] sequence = {1, 2, 3, 4, 5};
		int k = 7;
		int[] answer = {0, 0};
		int length = sequence.length;
        int left = 0;
		int right = length;
        int sum = 0;
        
        for(int l=0, r=0; l<length; l++) {
            while(r<length && sum<k) {
                sum += sequence[r++];
            }
            
            if(sum==k) {
                int range = r - l - 1;
                
                if((right - left)>range) {
                    left = l;
                    right = r - 1;
                }
            }
            
            sum -= sequence[l];
        }
        
        answer[0] = left;
		answer[1] = right;
		
		System.out.println(Arrays.toString(answer));
	}

}
