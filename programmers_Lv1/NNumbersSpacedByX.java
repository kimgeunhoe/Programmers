package programmers_Lv1;

public class NNumbersSpacedByX {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long[] answer = new long[n];

		for(int i=0; i<n; i++) {
			answer[i] = (long)x * (i + 1);
		}
		
		for(long a : answer) {
			System.out.println(a);
		}
	}

}
