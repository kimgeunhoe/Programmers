package programmers_Lv2;

import java.util.Arrays;

public class Carpet {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42842
	public static void main(String[] args) {
		int brown = 18;
		int yellow = 6;
//		int brown = 10;
//		int yellow = 2;
//		int[] answer = {0, 0};
//		int sum = brown + yellow;
		
//		for(int i=(int)Math.sqrt(yellow); i>=1; i--) {
//			if(yellow%i==0) {
//				answer[0] = yellow/i + 2;
//				answer[1] = i + 2;
//				
//				if(answer[0]*answer[1]==sum) {
//					break;
//				}
//			}
//		}
		
		int a = (brown + 4) / 2;
        int b = (int)Math.sqrt(a*a-4*(yellow + brown));
        
		System.out.println(Arrays.toString(new int[] {(a+b)/2, (a-b)/2}));
	}

}
