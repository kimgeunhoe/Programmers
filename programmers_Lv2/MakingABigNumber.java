package programmers_Lv2;

import java.util.Stack;

public class MakingABigNumber {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42883
	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		Stack<Character> stack = new Stack<>();
		char c = 0;
		char[] arr = new char[number.length()-k];
		
		for(int i=0; i<number.length(); i++) {
			c = number.charAt(i);
			
			while(!stack.empty() && stack.peek()<c && k-->0) {
				stack.pop();
			}
			
			stack.push(c);
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stack.get(i);
		}

		System.out.println(String.valueOf(arr));
	}

}
