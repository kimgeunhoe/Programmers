package programmers_Lv2;

import java.util.Arrays;

public class RepeatBinaryTransformation {
//	https://school.programmers.co.kr/learn/courses/30/lessons/70129
	public static void main(String[] args) {
		String s = "1100101010011111111111111111111111111111111100000000000000000000000";
		int[] answer = {0, 0};
		int length = 0;
		
		for(; length!=1; answer[0]++) {
			length = 0;
			
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)=='1') {
                    length++;
                }
            }

			answer[1] += s.length() - length;
			s = Integer.toBinaryString(length);
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
