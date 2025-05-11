package programmers_Lv2;

import java.util.Arrays;
import java.util.Stack;

public class FindTheBigNumberInTheBack {
//	https://school.programmers.co.kr/learn/courses/30/lessons/154539
	public static void main(String[] args) {
		int[] numbers = {2, 3, 3, 5};
		int length = numbers.length;
		Stack<Integer> stack = new Stack<>();
	    int[] answer = new int[length];

	    stack.push(0);

	    for(int i=1; i<length; i++) {
	        while(!stack.isEmpty() && numbers[stack.peek()]<numbers[i]) {
	            answer[stack.pop()] = numbers[i];
	        }

	        stack.push(i);
	    }

	    while(!stack.isEmpty()) {
	        answer[stack.pop()] = -1;
	    }
		
		System.out.println(Arrays.toString(answer));
	}

}
