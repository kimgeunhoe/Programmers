package programmers_Lv0;

public class OverwriteString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181943
	public static void main(String[] args) {
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;

		System.out.println(new StringBuilder(my_string.substring(0, s)).append(overwrite_string).append(my_string.substring(s + overwrite_string.length())).toString());
	}

}
