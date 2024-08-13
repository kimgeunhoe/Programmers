package programmers_Lv2;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
//		int[] citations = {0, 0, 0, 0};
//		int[] citations = {2};
//		int[] citations = {0, 1, 1, 1, 3, 5, 6};
//		int[] citations = {3, 0, 6, 1, 5};
		int[] citations = {1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10};
        int answer = 0;
        int n = citations.length;
        
        Arrays.sort(citations);
        
        for(int i=n-1; i>=0; i--) {
        	answer = Math.max(answer, Math.min(n-i, citations[i]));
        }
        
        System.out.println(answer);
	}

}
