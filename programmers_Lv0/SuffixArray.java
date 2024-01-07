package programmers_Lv0;

import java.util.Arrays;

public class SuffixArray {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181909
	public static void main(String[] args) {
		String my_string = "banana";
		String[] answer = new String[my_string.length()];
		
		for(int i=0; i<my_string.length(); answer[i]=my_string.substring(i++));
		
		Arrays.sort(answer);
		        
		System.out.println(Arrays.toString(answer));
	}

}
