package programmers_Lv2;

import java.util.Stack;

public class RemovePair {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12973
	public static void main(String[] args) {
//		String s = "cdcd";
		String s = "baabaa";
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
        	if(stack.size()>0 && stack.peek()==s.charAt(i)) {
        		stack.pop();
        	} else {
        		stack.add(s.charAt(i));
        	}
        }
        
        System.out.println(stack.isEmpty() ? 1 : 0);
	}

}
