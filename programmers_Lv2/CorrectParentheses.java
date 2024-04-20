package programmers_Lv2;

//import java.util.Stack;

public class CorrectParentheses {

	public static void main(String[] args) {
		String s = "()()";
	    boolean answer = true;
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
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
	    		check++;
	    	} else {
	    		if(check==0) {
	    			answer = false;
	    			break;
	    		} else {
	    			check--;
	    		}
	    	}
		}
		
		if(check!=0) {
			System.out.println(false);
		} else {
			System.out.println(answer);
		}
	}

}
