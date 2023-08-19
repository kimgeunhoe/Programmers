package programmers_Lv0;

import java.util.Arrays;

public class CreateMaximum1 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;
        
        Arrays.sort(numbers);
        
        System.out.println(numbers[length-2] * numbers[length-1]);
	}

}
