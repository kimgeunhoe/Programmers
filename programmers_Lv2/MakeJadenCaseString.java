package programmers_Lv2;

public class MakeJadenCaseString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12951
	public static void main(String[] args) {
		String s = "3people  unFollowed  me     ";
		s = s.toLowerCase();
	    StringBuilder answer = new StringBuilder(String.valueOf(s.charAt(0)).toUpperCase());

	    for(int i=1; i<s.length(); i++) {
	    	answer.append(s.charAt(i-1)==' ' ? String.valueOf(s.charAt(i)).toUpperCase() : s.charAt(i));
	    }
	    
	    System.out.println(answer.toString());
	}
}
