package programmers_Lv0;

public class StringWithinString {

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o"	;
		String str2 = "6CD";
		
		System.out.println(str1.contains(str2) ? 1 : 2);
	}

}
