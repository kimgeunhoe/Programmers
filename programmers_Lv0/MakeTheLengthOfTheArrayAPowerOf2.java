package programmers_Lv0;

import java.util.Arrays;

public class MakeTheLengthOfTheArrayAPowerOf2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] answer = {};
		int length = 1;
		
		while(arr.length>length) {
			length *= 2;
		}
		
		answer = new int[length];
		answer = Arrays.copyOfRange(arr, 0, length);
		        
		System.out.println(Arrays.toString(answer));
	}

}
