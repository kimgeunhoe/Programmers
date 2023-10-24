package programmers_Lv0;

public class NCharactersAfterAString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181910
	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		
		System.out.println(my_string.substring(my_string.length() - n));
	}

}
