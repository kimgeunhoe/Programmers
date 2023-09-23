package programmers_Lv0;

import java.util.Arrays;

public class FromTheBackToTheFifthPlace {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		Arrays.sort(num_list);

		System.out.println(Arrays.toString(Arrays.copyOfRange(num_list, 0, 5)));
	}

}
