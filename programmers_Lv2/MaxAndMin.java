package programmers_Lv2;

import java.util.Arrays;

public class MaxAndMin {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12939
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
//		String s = "1 2 3 4";
	    StringBuilder answer = new StringBuilder();
	    String[] str = s.split(" ");
	    int length = str.length;
	    int[] num = new int[length];
	    
	    for(int i=0; i<length; i++) {
	    	num[i] = Integer.parseInt(str[i]);
	    }
	    
	    Arrays.sort(num);
	    
	    System.out.println(answer.append(num[0]).append(" ").append(num[length-1]).toString());
	}

}
