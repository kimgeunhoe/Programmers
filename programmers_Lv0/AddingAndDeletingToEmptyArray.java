package programmers_Lv0;

import java.util.Arrays;
import java.util.Stack;

public class AddingAndDeletingToEmptyArray {

	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		int[] answer = {};
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<flag.length; i++) {
			if(flag[i]) {
				for(int j=0; j<arr[i]*2; stack.push(arr[i]), j++);
			} else {
				for(int j=0; j<arr[i]; stack.pop(), j++);
			}
		}
		
		answer = new int[stack.size()];
		
		for(int i=0; i<stack.size(); answer[i]=stack.get(i++));
				
		System.out.println(Arrays.toString(answer));
	}

}
