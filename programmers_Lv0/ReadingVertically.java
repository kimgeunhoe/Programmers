package programmers_Lv0;

public class ReadingVertically {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181904
	public static void main(String[] args) {
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;
		StringBuilder sb = new StringBuilder();
		        
		for(int i=c-1; i<my_string.length(); sb.append(my_string.charAt(i)), i+=m);

		System.out.println(sb.toString());
	}

}
