package programmers_Lv0;

public class CapitalizeCertainCharacters {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181873
	public static void main(String[] args) {
		String my_string = "programmers";
		String alp = "p";
		
		System.out.println(my_string.replace(alp, alp.toUpperCase()));
	}

}
