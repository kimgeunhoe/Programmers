package programmers_Lv0;

import java.util.Arrays;

public class FindTheMedian {

	public static void main(String[] args) {
		int[] array = {1, 2, 7, 10, 11};

	    Arrays.sort(array);
	    
	    System.out.println(array[array.length/2]);
	}

}
