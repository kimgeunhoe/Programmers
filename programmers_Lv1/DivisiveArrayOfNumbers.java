package programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisiveArrayOfNumbers {

	public static void main(String[] args) {
//		int[] arr = {5, 9, 7, 10};
//		int[] arr = {2, 36, 1, 3};
		int[] arr = {3, 2, 6};
//		int divisor = 5;
//		int divisor = 1;
		int divisor = 10;
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int a : arr) {
        	if(a%divisor==0) {
        		list.add(a);
        	}
        }
        
        if(list.isEmpty()) {
        	answer = new int[1];
        	answer[0] = -1;
        } else {
        	answer = new int[list.size()];
        	
        	for(int i=0; i<list.size(); i++) {
        		answer[i] = list.get(i);
        	}
        	
        	Arrays.sort(answer);
        }
        
        for(int a : answer) {
        	System.out.println(a);
        }
	}

}
