package programmers_Lv2;

//import java.util.Stack;

public class CorrectParentheses {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12909
	public static void main(String[] args) {
		String s = "()()";
//	    boolean answer = true;
//	    Stack<Character> stack = new Stack<>();
		int check = 0;
//
//	    for(int i=0; i<s.length(); i++) {
//	    	if(s.charAt(i)=='(') {
//	    		stack.add(s.charAt(i));
//	    	} else {
//	    		if(!stack.empty()) {
//	    			stack.pop();
//	    		} else {
//	    			answer = false;
//	    			break;
//	    		}
//	    	}
//	    }
	    
//	    System.out.println(answer);
//	    System.out.println(stack.empty());
		
		for(int i=0; i<s.length() && check>=0; i++) {
			check += s.charAt(i)=='(' ? 1 : -1;
		}
		
		System.out.println(check==0);
	}

}
