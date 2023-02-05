package programmers_Lv0;

public class RemoveSpecificCharacters {

	public static void main(String[] args) {
		String my_string = "BCBdbe";
		String letter = "B";
//		String my_string = "abcdef";
//		String letter = "f";

        System.out.println(my_string.replace(letter, ""));
	}

}
