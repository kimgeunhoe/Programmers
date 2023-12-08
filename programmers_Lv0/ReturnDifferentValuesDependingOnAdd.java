package programmers_Lv0;

public class ReturnDifferentValuesDependingOnAdd {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181935
	public static void main(String[] args) {
		int n = 7;
		
		System.out.println(n%2==0 ? n / 2 * (n / 2 + 1) * (n + 1) / 6 * 4 : (n + 1) * (n + 1) / 4);
	}

}
