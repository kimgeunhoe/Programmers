package programmers_Lv0;

import java.util.Arrays;

public class LeftRight {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181890
	public static void main(String[] args) {
		String[] str_list = {"u", "u", "l", "r"};
		String[] answer = {};
		        
		for(int i=0; i<str_list.length; i++) {
			if("l".equals(str_list[i])) {
				answer = Arrays.copyOfRange(str_list, 0, i);
				break;
			} else if("r".equals(str_list[i])) {
				answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
				break;
			}
		}
		        
		System.out.println(Arrays.toString(answer));
	}

}
