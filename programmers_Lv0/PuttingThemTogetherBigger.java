package programmers_Lv0;

public class PuttingThemTogetherBigger {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181939
	public static void main(String[] args) {
		int a = 9;
		int b = 91;
		
		System.out.println(Math.max(Integer.parseInt(new StringBuilder().append(a).append(b).toString()), Integer.parseInt(new StringBuilder().append(b).append(a).toString())));
	}

}
