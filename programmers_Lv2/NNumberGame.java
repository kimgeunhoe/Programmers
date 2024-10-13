package programmers_Lv2;

public class NNumberGame {
//	https://school.programmers.co.kr/learn/courses/30/lessons/17687
	public static void main(String[] args) {
		int n = 2;
		int t = 4;
		int m = 2;
		int p = 1;
		
		StringBuilder sb = new StringBuilder();
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; sb.length()<t*m; i++) {
			sb.append(Integer.toString(i, n));
		}
		
		for(int i=p-1; i<t*m; i+=m) {
			answer.append(sb.charAt(i));
		}

        System.out.println(answer.toString().toUpperCase());
	}

}
