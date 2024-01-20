package programmers_Lv0;

public class ToCompareTwoComputationalValues {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181938
	public static void main(String[] args) {
		int a = 2;
		int b = 91;

		System.out.println(Math.max(Integer.parseInt(new StringBuilder().append(a).append(b).toString()), 2 * a * b));
	}

}
