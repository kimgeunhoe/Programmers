package programmers_Lv2;

import java.util.Arrays;

public class Lifeboat {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42885
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		int i = 0;
		        
		Arrays.sort(people);
		
		for (int j=people.length-1; i<j; j--) {
			if(people[i]+people[j]<=limit) {
				i++;
			}
		}

		System.out.println(people.length - i);
	}

}
