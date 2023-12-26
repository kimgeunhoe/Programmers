package programmers_Lv0;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String my_string = "hi12392";
		int[] answer = {};

		my_string = my_string.replaceAll("[^0-9]", "");
		answer = new int[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = Character.getNumericValue(my_string.charAt(i));
		}

		Arrays.sort(answer);

		System.out.println(Arrays.toString(answer));
	}

}
