package programmers_Lv1;

import java.time.LocalDate;
//import java.time.format.TextStyle;
//import java.util.Locale;

public class Year2016 {

	public static void main(String[] args) {
		int a = 5;
		int b = 26;

		System.out.println(LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3));
		//System.out.println(LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());
	}

}