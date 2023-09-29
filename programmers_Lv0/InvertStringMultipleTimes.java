package programmers_Lv0;

public class InvertStringMultipleTimes {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181913
	public static void main(String[] args) {
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		StringBuilder sb = new StringBuilder(my_string);
				
		for(int[] q : queries) {
			sb = new StringBuilder(sb.subSequence(0, q[0])).append(new StringBuilder(sb.subSequence(q[0], q[1] + 1)).reverse()).append(sb.subSequence(q[1] + 1, sb.length()));
		}

		System.out.println(sb.toString());
	}

}
