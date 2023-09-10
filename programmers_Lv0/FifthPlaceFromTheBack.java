package programmers_Lv0;

import java.util.Arrays;

public class FifthPlaceFromTheBack {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		
		Arrays.sort(num_list);

		System.out.println(Arrays.toString(Arrays.copyOfRange(num_list, 5, num_list.length)));
	}

}
