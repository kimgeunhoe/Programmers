package programmers_Lv0;

public class MixingString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181942
	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		StringBuilder sb = new StringBuilder();
		        
		for(int i=0; i<str1.length(); i++) {
			sb.append(str1.charAt(i)).append(str2.charAt(i));
		}

		System.out.println(sb.toString());
	}

}
