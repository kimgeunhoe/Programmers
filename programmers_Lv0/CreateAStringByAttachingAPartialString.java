package programmers_Lv0;

public class CreateAStringByAttachingAPartialString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181911
	public static void main(String[] args) {
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		StringBuilder sb = new StringBuilder();
		        
		for(int i=0; i<parts.length; i++) {
			sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
		}

		System.out.println(sb.toString());
	}

}
