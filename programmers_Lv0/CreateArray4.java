package programmers_Lv0;

import java.util.Arrays;
import java.util.Stack;

public class CreateArray4 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181918
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 5, 3};
		int[] stk = {};
		Stack<Integer> stack = new Stack<>();
		
		for(int a : arr) {
			while(!stack.empty() && a<=stack.peek()) {
				stack.pop();
			}
			
			stack.push(a);
		}
		
		stk = new int[stack.size()];
		
		for(int i=0; i<stk.length; stk[i]=stack.get(i++));

		System.out.println(Arrays.toString(stk));
	}

}
