package programmers_Lv0;

import java.util.Arrays;

public class OXQuiz {

	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
	    String[] answer = new String[quiz.length];
	    String[] str = {};
	    
	    for(int i=0; i<quiz.length; i++) {
	    	str = quiz[i].split(" ");
	    	answer[i] = Integer.parseInt(str[0])+Integer.parseInt(str[2])*(str[1].equals("+") ? 1 : -1)==Integer.parseInt(str[4]) ? "O" : "X";
	    }
	    
	    Arrays.stream(answer).forEach(System.out::println);
	}

}
