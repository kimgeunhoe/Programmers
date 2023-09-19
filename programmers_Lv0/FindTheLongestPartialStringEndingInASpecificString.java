package programmers_Lv0;

public class FindTheLongestPartialStringEndingInASpecificString {

	public static void main(String[] args) {
		String myString = "AbCdEFG";
		String pat = "dE";
		
		System.out.println(myString.substring(0, myString.lastIndexOf(pat) + pat.length()));
	}

}
