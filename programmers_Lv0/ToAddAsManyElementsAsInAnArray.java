package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToAddAsManyElementsAsInAnArray {

	public static void main(String[] args) {
		int[] arr = {5, 1, 4};
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		
		for(int a : arr) {
			for(int i=0; i<a; list.add(a), i++);
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<list.size(); answer[i]=list.get(i++));
		        
		System.out.println(Arrays.toString(answer));
	}

}
