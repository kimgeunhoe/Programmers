package programmers_Lv0;

public class ToConvertACharacterListToAString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181941
	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		StringBuilder sb = new StringBuilder();
		        
		for(String a : arr) {
			sb.append(a);
		}

		System.out.println(sb.toString());
	}

}
