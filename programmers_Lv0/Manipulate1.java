package programmers_Lv0;

public class Manipulate1 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181926
	public static void main(String[] args) {
		int n = 0;
		String control = "wsdawsdassw";
		char c = 0;

		for(int i=0; i<control.length(); i++) {
			c = control.charAt(i);
			n += (c=='w' ? 1 : c=='s' ? -1 : c=='d' ? 10 : -10);
		}

		System.out.println(n);
	}

}
