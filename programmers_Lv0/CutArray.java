package programmers_Lv0;

import java.util.Arrays;

public class CutArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
	    
	    System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, num1, num2 + 1)));
	}

}
