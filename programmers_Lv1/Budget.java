package programmers_Lv1;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		int money = 0;
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			money+= d[i];
			
			if(money>budget) {
				answer = i;
				break;
			} else if(money==budget || i==d.length-1) {
				answer = i + 1;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
