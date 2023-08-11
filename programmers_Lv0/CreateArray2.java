package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray2 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181921
	public static void main(String[] args) {
		int l = 5;
		int r = 555;
		int[] answer = {-1};
		List<Integer> list = new ArrayList<>();
		int num = 5;
		
		for(int i=2; num<=r; i++) {
			if(num>=l) {
				list.add(num);
			}
			
			num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
		}
		
		if(!list.isEmpty()) {
			answer = new int[list.size()];
			
			for(int i=0; i<answer.length; answer[i]=list.get(i++));
		}

		System.out.println(Arrays.toString(answer));
	}

}
