package programmers_Lv0;

import java.util.Arrays;
import java.util.Stack;

public class CreateArray6 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 1, 0};
		int[] answer = {};
		Stack<Integer> stack = new Stack<>();
		int size = 0;
		
		for(int a : arr) {
			if(stack.size()>0 && stack.peek()==a) {
				stack.pop();
			} else {
				stack.push(a);
			}
		}
		
		size = stack.size();
		
		if(size==0) {
			answer = new int[] {-1};
		} else {
			answer = new int[size];
			
			for(int i=0; i<size; answer[i]=stack.get(i++));
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
