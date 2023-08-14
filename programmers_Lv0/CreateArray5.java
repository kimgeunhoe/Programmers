package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray5 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181912
	public static void main(String[] args) {
		String[] intStrs= {"0123456789", "9876543210", "9999999999999"};
		int k = 50000;
		int s = 5;
		int l = 5;
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		int num = 0;
		
		for(String i : intStrs) {
			num = Integer.parseInt(i.substring(s, s + l));
			
			if(num>k) {
				list.add(num);
			}
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<answer.length; answer[i]=list.get(i++));
		
		System.out.println(Arrays.toString(answer));
	}

}
