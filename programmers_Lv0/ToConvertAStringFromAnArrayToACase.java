package programmers_Lv0;

import java.util.Arrays;

public class ToConvertAStringFromAnArrayToACase {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181875
	public static void main(String[] args) {
		String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = i%2==0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
		}
		        
		System.out.println(Arrays.toString(strArr));
	}

}
