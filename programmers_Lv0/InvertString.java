package programmers_Lv0;

public class InvertString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181905
	public static void main(String[] args) {
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
		
		System.out.println(new StringBuilder(my_string.substring(0, s)).append(new StringBuilder(my_string.substring(s, e + 1)).reverse()).append(my_string.substring(e+1)).toString());
	}

}
