package programmers_Lv1;

public class HandleStringBase {

	public static void main(String[] args) {
		String s = "a234";

	    System.out.println((s.length()==4 || s.length()==6) && s.matches("^[0-9]*$"));
	}

}
