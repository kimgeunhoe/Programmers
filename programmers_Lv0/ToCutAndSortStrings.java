package programmers_Lv0;

import java.util.Arrays;

public class ToCutAndSortStrings {

	public static void main(String[] args) {
		String myString = "axbxcxdx";
		
		System.out.println(Arrays.toString(Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new)));
	}

}
