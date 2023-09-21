package programmers_Lv0;

import java.util.Arrays;

public class FiveAtATime {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181886
	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		String[] answer = new String[(names.length-1)/5 + 1];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = names[i*5];
		}
		        
		System.out.println(Arrays.toString(answer));
	}

}
