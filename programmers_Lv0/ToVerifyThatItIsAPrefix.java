package programmers_Lv0;

public class ToVerifyThatItIsAPrefix {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181906
	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "ban";
		
		System.out.println(my_string.startsWith(is_prefix) ? 1 : 0);
	}

}
