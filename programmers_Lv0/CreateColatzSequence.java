package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateColatzSequence {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181919
	public static void main(String[] args) {
		int n = 10;
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		int size = 0;
		
		while(n>1) {
			list.add(n);
			n = n%2==0 ? n / 2 : 3 * n + 1;
		}
		
		size = list.size();
		answer = new int[size+1];
		
		for(int i=0; i<size; answer[i]=list.get(i++));
		
		answer[size] = 1;

		System.out.println(Arrays.toString(answer));
	}

}
