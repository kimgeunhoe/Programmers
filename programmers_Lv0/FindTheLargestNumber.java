package programmers_Lv0;

import java.util.Arrays;

public class FindTheLargestNumber {

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
        
        for(int i=0; i<array.length; i++) {
        	if(answer[0]<array[i]) {
        		answer[0] = array[i];
        		answer[1] = i;
        	}
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
