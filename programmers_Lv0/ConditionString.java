package programmers_Lv0;

public class ConditionString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181934
	public static void main(String[] args) {
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 50;
		int answer = 0;
		        
		if("=".equals(eq) && n==m) {
			answer = 1; 
		}
		
		if("<".equals(ineq)) {
			if(n<m) {
				answer = 1;
			}
		} else {
			if(n>m) {
				answer = 1;
			}
		}

		System.out.println(answer);
	}

}
