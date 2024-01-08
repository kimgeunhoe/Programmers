package programmers_Lv0;

import java.util.Arrays;

public class SumOfConsecutiveNumbers {

	public static void main(String[] args) {
		int num = 3;
		int total = 12;
        int[] answer = new int[num];
        int number = 0;
        int index = 0;
        
        number = total/num;
    	index = num/2 - (num%2==1 ? 0 : 1);
    	
    	for(int i=0; i<num; i++) {
    		answer[i] = number + i - index;
    	}
    	
        Arrays.stream(answer).forEach(System.out::println);
	}

}
