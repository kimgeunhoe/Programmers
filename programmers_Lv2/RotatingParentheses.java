package programmers_Lv2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class RotatingParentheses {
//	https://school.programmers.co.kr/learn/courses/30/lessons/76502
	public static LinkedList<Character> order = new LinkedList<>();
	public static Map<Character, Character> map = new HashMap<>();

	public static void main(String[] args) {
		String s = "[](){}";
		int answer = 0;
		
		 map.put('(', ')');
		 map.put('{', '}');
		 map.put('[', ']');
		
		for(int i=0; i<s.length(); i++) {
			order.add(s.charAt(i));
		}
		
		for(int i=0; i<s.length()-1; i++) {
			answer += checkValid();
			
			order.add(order.poll());
		}

		System.out.println(answer);
	}

	public static int checkValid() {
		Stack<Character> stack = new Stack<>();
		
		for(char o : order) {
			if(map.containsKey(o)) {
				stack.add(o);
			} else {
				if(stack.empty() || map.get(stack.peek())!=o) {
					return 0;
				} else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return 1;
		}
		
		return 0;
	}
}
