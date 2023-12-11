package programmers_Lv0;

public class ReturnDifferentValuesDependingOnFlag {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181933
	public static void main(String[] args) {
		int a = -4;
		int b = 7;
		boolean flag = true;

		System.out.println(a + (flag ? b : -b));
	}

}
