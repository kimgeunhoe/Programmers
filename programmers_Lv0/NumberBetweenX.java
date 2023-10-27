package programmers_Lv0;

import java.util.Arrays;

public class NumberBetweenX {

	public static void main(String[] args) {
		String myString = "oxooxoxxox";
		
		System.out.println(Arrays.toString(Arrays.stream(myString.split("x", myString.length())).mapToInt(x -> x.length()).toArray()));
	}

}
