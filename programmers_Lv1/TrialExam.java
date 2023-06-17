package programmers_Lv1;

import java.util.ArrayList;
import java.util.List;

public class TrialExam {

	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5};
		int[] answer;
		int[] num;
		int[] one = {1, 2, 3, 4, 5};
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i]==one[i%one.length]) {
				a++;
			}
			
			if(answers[i]==two[i%two.length]) {
				b++;
			}
			
			if(answers[i]==three[i%three.length]) {
				c++;
			}
		}
		
		num = new int[]{a, b, c};
		max = Math.max(Math.max(a, b), c);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<num.length; i++) {
			if(num[i]==max) {
				list.add(i+1);
			}
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		for(int an : answer) {
			System.out.println(an);
		}
	}

}
