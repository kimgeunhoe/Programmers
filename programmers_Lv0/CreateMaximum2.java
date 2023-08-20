package programmers_Lv0;

import java.util.Arrays;

public class CreateMaximum2 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, -3, 4, -5};
		
		 Arrays.sort(numbers);

		 System.out.println((int)Math.max(numbers[0]*numbers[1], numbers[numbers.length-2]*numbers[numbers.length-1]));
	}

}
