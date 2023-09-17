package programmers_Lv0;

public class FindTheDesiredSring {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181878
	public static void main(String[] args) {
		String myString = "AbCdEfG";
		String pat = "aBc";
		
		System.out.println(myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0);
	}

}
