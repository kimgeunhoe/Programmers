package programmers_Lv0;

public class UppercaseAndLowercaseLetters {

	public static void main(String[] args) {
		String my_string = "cccCCC";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<my_string.length(); i++) {
			sb.append((char)(my_string.charAt(i) + (my_string.charAt(i)<=90 ? 32 : -32)));
		}

        System.out.println(sb.toString());
	}

}
